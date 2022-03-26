package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();

driver.get("https://twitter.com/");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
	}

}
