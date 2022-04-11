package Explicitwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class expwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");

WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

WebElement username=driver.findElement(By.id("email"));
wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("sfg");

driver.findElement(By.name("pass")).sendKeys("hdf");

WebElement button=driver.findElement(By.xpath("//button[@name='login']"));
wait.until(ExpectedConditions.elementToBeClickable(button)).click();

String Title=driver.getTitle();
System.out.println(Title);
	}

}
