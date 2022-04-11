package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class photo {

	private static final int X = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Java selenium\\Newseleniumproj\\Driversoftware\\geckodriver.exe");		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File ram = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./Photo/amazon.png");
		
		FileUtils.copyFile(ram, dest);
		
		driver.close();
	}

}
