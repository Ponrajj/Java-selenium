package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Fcabookdropdwn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Java selenium\\Newseleniumproj\\Driversoftware\\geckodriver.exe");		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement month = driver.findElement(By.id("month"));
		Select s=new Select(month);
		s.selectByVisibleText("Jun");
		List<WebElement> list = s.getOptions();
		int list_count = list.size();
		System.out.println(list_count);
		System.out.println(month.getText());
		System.out.println(s.isMultiple());
	
driver.close();
}
}