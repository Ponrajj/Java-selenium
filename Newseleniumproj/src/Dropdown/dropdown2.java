package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "D:\\Java selenium\\Newseleniumproj\\Driversoftware\\geckodriver.exe");		
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.ebay.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement dropdown = driver.findElement(By.id("gh-cat"));
Select s=new Select(dropdown);
s.selectByIndex(2);
driver.close();
	}

}
