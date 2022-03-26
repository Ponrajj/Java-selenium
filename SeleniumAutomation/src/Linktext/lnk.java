package Linktext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lnk {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(1000);
driver.findElement(By.linkText("Forgotten password?")).click();
Thread.sleep(1000);
driver.findElement(By.id("identify_email")).sendKeys("9836353729");
Thread.sleep(2000);
driver.findElement(By.id("did_submit")).click();
Thread.sleep(2000);
driver.close();
	}

}
