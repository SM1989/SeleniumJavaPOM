import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.dashboard;
import pages.login;
import config.readandwrite;


public class TestPOM_TestNG {
	
		WebDriver driver = null;
		 ExtentReports extent = null;
		 ExtentTest test = null;
		 
		 


		@BeforeTest
		public void setUp(){
		String browsername = readandwrite.getproperties();
		String path = System.getProperty("user.dir");
			
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");	    
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);	
		test = extent.createTest("MyFirstTest", "Sample description");
		System.out.println(browsername);
		
		
		if (browsername.equalsIgnoreCase("chrome"))
		{			
			System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver_1.exe");	
			driver = new ChromeDriver();
		}
		
		else if (browsername.equalsIgnoreCase("firefox")) 
		
		{			
			System.setProperty("webdriver.gecko.driver", path+"/drivers/geckodriver.exe");	
			driver = new FirefoxDriver();
		}
		}
		
		@Test
		public void test() throws Exception{
		
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
		
//		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.info("This step shows usage of info(details)");        
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());        
        test.addScreenCaptureFromPath("screenshot.png");
       
		
	}
		@AfterTest
		public void tearDown(){
			extent.flush();
			driver.close();
			System.out.println("Test Completed");
			
		}
}