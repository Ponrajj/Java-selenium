package Finish;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autosugges {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "D:\\Java selenium\\Newseleniumproj\\Driversoftware\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
WebElement ele1 = driver.findElement(By.name("q"));
ele1.sendKeys("seleni");

Thread.sleep(3000);
List<WebElement> rat1 = driver.findElements(By.xpath("//li[@class='sbct']"));
System.out.println(rat1.size());

for(WebElement c:rat1) {
	System.out.println(c.getText());

}

driver.close();
	}

}
