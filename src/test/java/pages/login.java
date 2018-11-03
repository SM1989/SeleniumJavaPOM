package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	static WebDriver driver = null;

	public login (WebDriver driver){
		this.driver  = driver;
	}
	
	public void loginmethod(String username, String password) throws Exception{
		System.out.println("Inside Login Method");
		System.out.println("UserName is::" +username + "Password is::" +password);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).clear();
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		System.out.println("Entered Username");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).clear();
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		System.out.println("Entered Password");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		System.out.println("Clicked on the Login Button");
		try{
			System.out.println("Inside try");
			String text = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(text);
			assert 1 == 0;
		}
		catch(Exception e) {
			System.out.println("Inside catch");
			System.out.println("Login Done");
			
		}		
	}
}
