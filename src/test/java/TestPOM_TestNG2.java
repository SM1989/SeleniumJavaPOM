import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.dashboard;
import pages.login;


public class TestPOM_TestNG2 {
	
		WebDriver driver = null;

		@BeforeTest
		public void setUp(){
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver_1.exe");
	
		driver = new ChromeDriver();
		}
		
		@Test
		public void test2() throws Exception{
		
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
	}
		
		@Test
		public void test3() throws Exception{
		
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
	}
		
		@Test
		public void test4() throws Exception{
		
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
	}
		
		@AfterTest
		public void tearDown(){
			driver.close();
			System.out.println("Test Completed");
			
		}
}