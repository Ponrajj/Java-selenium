package Doubleclick;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Java selenium\\Newseleniumproj\\Driversoftware\\geckodriver.exe");		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement mouse = driver.findElement(By.id("course"));
		
		Actions a=new Actions(driver);
		a.moveToElement(mouse).perform();
		
		driver.findElement(By.xpath("//a[text()=\"Selenium Training\"]")).click();
		
		WebElement clu = driver.findElement(By.id("add"));
		a.doubleClick(clu).perform();

		driver.close();
		
		
	    
		
	}

}
