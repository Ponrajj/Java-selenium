package WindowsManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Winmanage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.oneplus.in/launch/10-pro");



driver.manage().window().fullscreen();

driver.manage().window().minimize();

driver.manage().window().maximize();

driver.close();

	}

}
