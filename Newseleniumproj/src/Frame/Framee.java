package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framee {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "D:\\Java selenium\\Newseleniumproj\\Driversoftware\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://paytm.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
driver.findElement(By.xpath("//span[text()='Sign In']")).click();
Thread.sleep(5);
driver.switchTo().frame(0);
Thread.sleep(5);
driver.findElement(By.xpath("//a[@event-category='web_login'][1]")).click();
driver.close();
	}

}
