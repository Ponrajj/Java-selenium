package Selected;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
WebElement selec=driver.findElement(By.xpath("//label[text()='Male']"));
if(selec.isSelected()) {
	System.out.println("Pass:Is selected");
}
else {
	System.out.println("fail:noit selected");
}

driver.close();

	}

}
