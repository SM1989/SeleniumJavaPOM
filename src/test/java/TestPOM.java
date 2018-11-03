import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.dashboard;
import pages.login;


public class TestPOM {

	public static void main(String[] args) throws Exception {
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver_1.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://opensource-demo.orangehrmlive.com/");		
		login pageobject = new login(driver);
		dashboard dashboarobject = new dashboard(driver);
		pageobject.loginmethod("Admin","admin123");
		dashboarobject.navigation("Admin");
		dashboarobject.navigation("PIM");
		dashboarobject.navigation("Leave");
		dashboarobject.navigation("Time");
		dashboarobject.navigation("Recruitment");
		dashboarobject.navigation("Performance");
		dashboarobject.navigation("Dashboard");
		dashboarobject.navigation("Directory");
		dashboarobject.logout();
		driver.close();
		System.out.println("Test Completed");
	}
}