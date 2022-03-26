package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locato {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("jsckcn");
Thread.sleep(1000);
driver.findElement(By.name("pass")).sendKeys("hjkkm");
Thread.sleep(1000);
driver.findElement(By.name("login")).click();
	
	}

}
