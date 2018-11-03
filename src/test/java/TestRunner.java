import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

////Chromedriver 2.36 is used

public class TestRunner {
	
	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		System.out.println(path);			
//		System.setProperty("webdriver.gecko.driver", path+"/drivers/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver_1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
	}			
}