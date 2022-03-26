package Partiallink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parti {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapp.skillrary.com/");
Thread.sleep(1000);
driver.findElement(By.linkText("LOGIN")).click();
Thread.sleep(1000);
driver.findElement(By.name("email")).sendKeys("user");
Thread.sleep(1000);
driver.findElement(By.name("password")).sendKeys("user1");
Thread.sleep(1000);
driver.findElement(By.partialLinkText("Forgot your pas")).click();
	}

}
