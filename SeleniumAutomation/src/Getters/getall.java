package Getters;

import java.awt.Dimension;
import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
WebElement sea=driver.findElement(By.xpath("//h2[text()=\"Amazon Pay | Book your travel tickets\"]"));
System.out.println(sea.getText());
System.out.println(sea.getAttribute("class"));

org.openqa.selenium.Point loc=sea.getLocation();
System.out.println(loc.getX()+"Xcoord");
System.out.println(loc.getY()+"Ycoord");
 
org.openqa.selenium.Dimension s=sea.getSize();
System.out.println(s.getHeight());
System.out.println(s.getWidth());
	   
WebElement searc=driver.findElement(By.xpath("//input[@type='text']"));
if(searc.isDisplayed()) {
	System.out.println("pass:ele is display");
}
else {
	System.out.println("fail:ele is not displayed");
}

       
driver.close();


	}

}
