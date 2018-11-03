package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class dashboard {
	static WebDriver driver = null;
	static WebDriverWait wait = null;
//	WebDriverWait wait = new WebDriverWait(driver, 30);

	public dashboard(WebDriver driver){
		dashboard.driver = driver;
		
	}
	
	public void navigation(String menu){
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		System.out.println("Inside navigation method");
		String xpath = "//li/a[contains(@id,'menu')]/b[text()='" + menu + "']";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		System.out.println(xpath);
		driver.findElement(By.xpath(xpath)).click();
		System.out.println("Clicked");		
	}
	
	public void logout() throws Exception{
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		System.out.println("Inside logout method");
		driver.findElement(By.xpath("//div/a[@id='welcome']")).click();
//		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li/a[text()='Logout']")));
		driver.findElement(By.xpath("//li/a[text()='Logout']")).click();
		System.out.println("Logout Completed");
		}
	}