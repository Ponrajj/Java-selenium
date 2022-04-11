package Mousehover;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Hovermouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Java selenium\\Newseleniumproj\\Driversoftware\\geckodriver.exe");		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement rat1 = driver.findElement(By.xpath("(//a[@class='desktop-main'])[4]"));
		
		Actions a=new Actions(driver);
		a.moveToElement(rat1).perform();
		
		driver.findElement(By.xpath("//a[text()='Wall Décor']")).click();
		
		driver.close();
	}

}
