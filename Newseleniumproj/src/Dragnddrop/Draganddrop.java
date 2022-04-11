package Dragnddrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Java selenium\\Newseleniumproj\\Driversoftware\\geckodriver.exe");		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement block1 = driver.findElement(By.xpath("(//div[@class='block'])[1]"));
		WebElement block4 = driver.findElement(By.xpath("(//div[@class='block'])[4]"));
		
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		a.dragAndDrop(block1, block4).perform();
	}

}
