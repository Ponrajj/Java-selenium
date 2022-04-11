package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Multislectdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Java selenium\\Newseleniumproj\\Driversoftware\\geckodriver.exe");		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dd = driver.findElement(By.id("cars"));
		Select s=new Select(dd);
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByValue("299");
		Thread.sleep(3000);
		s.selectByVisibleText("More Than INR 500 ( 55 )");
		Thread.sleep(3000);
		
		
		s.deselectByIndex(1);
		Thread.sleep(3000);
		s.deselectByValue("299");
		Thread.sleep(3000);
		s.deselectByVisibleText("More Than INR 500 ( 55 )");
		Thread.sleep(3000);
		System.out.println(s.isMultiple());
		
		if(s.isMultiple()) {
			s.deselectAll();
			
		}
		
	
		driver.close();		
	}

}
