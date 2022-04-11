package Verifications;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.ebay.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
WebElement ena=driver.findElement(By.xpath("//input[@type='submit']"));
if (ena.isDisplayed()){
	System.out.println("Pass:is enabled");
}
else {
	System.out.println("fail:not enabled");
}
driver.close();
	}

}
