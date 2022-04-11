package Loginscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("mxancc");
driver.findElement(By.name("pass")).sendKeys("hdf");
driver.findElement(By.xpath("//button[@name='login']")).click();
String Title=driver.getTitle();
System.out.println(Title);

if(Title.equals("Facebook – log in or sign up")) {
	System.out.println("Pass:Home is dsiplay");
}
	else {
		System.out.println("Pass:Failed");
}

String url=driver.getCurrentUrl();
System.out.println(url);

driver.close();




	}

}
