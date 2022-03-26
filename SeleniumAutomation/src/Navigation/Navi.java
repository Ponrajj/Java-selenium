package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();

driver.get("https://www.samsung.com/");

driver.navigate().to("https://www.oneplus.in/");

Thread.sleep(3000);

driver.navigate().back();

Thread.sleep(3000);

driver.navigate().forward();

Thread.sleep(3000);
driver.navigate().refresh();

Thread.sleep(3000);

driver.close();
	}

}
