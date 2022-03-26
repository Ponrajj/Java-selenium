package Cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectorsgh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(1000);
driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("use");
Thread.sleep(1000);
driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("dndv");
Thread.sleep(1000);
driver.findElement(By.cssSelector("button[name=\"login\"]")).click();

	}

}
