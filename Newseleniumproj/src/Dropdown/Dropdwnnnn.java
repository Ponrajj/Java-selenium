package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdwnnnn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "D:\\Java selenium\\Newseleniumproj\\Driversoftware\\geckodriver.exe");		
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
Select s=new Select(dropdown);
s.selectByIndex(3);
driver.close();
	}

}
