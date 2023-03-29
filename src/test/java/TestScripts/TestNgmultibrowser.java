package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

 public class TestNgmultibrowser {
	WebDriver driver;
	String projectpath=System.getProperty("user.dir");
	String Browsername="chrome";
	//@Parameters("browser name")
	@BeforeMethod
	//@Parameters("browser name")
	public void setup(String Browsername ) {
		System.out.println("Browser name is : "+Browsername );
		if(Browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driverss/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(Browsername.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\eclipse-workspace\\Automation\\driverss\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		else if(Browsername.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\User\\eclipse-workspace\\Automation\\driverss\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
			 }
		
	}
	@Test
	public void Testcase1() {
		driver.get("https://google.com");
		
	}
//	@AfterClass
	public void teardown() {
		driver.close();
		System.out.println("Test completed successful");
		
	}

}
