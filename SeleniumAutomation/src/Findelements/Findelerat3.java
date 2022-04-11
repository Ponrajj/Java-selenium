package Findelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelerat3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.co.in/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
WebElement ele1 = driver.findElement(By.name("q"));
ele1.sendKeys("Seleni");

List<WebElement> rat1 = driver.findElements(By.xpath("//li[@class='sbct']"));
System.out.println(rat1.size());

for(WebElement c:rat1) {
	System.out.println(c.getText());
}
driver.close();
	}

}
