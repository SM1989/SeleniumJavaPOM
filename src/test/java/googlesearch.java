import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearch {

	public static void main(String[] args) {
		
		search();		

	}
	
	public static void search(){
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+ "/drivers/chromedriver_1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.google.com");
		driver.findElement(By.xpath("//div/input[@id='lst-ib']")).sendKeys("Saurabh");
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		driver.close();
		System.out.println("Test Completed!!");
		
	}
}

