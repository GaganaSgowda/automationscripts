package genericlibrary;

import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver sdriver;
	public WebDriver driver;
	@BeforeClass
	public void setup() throws Throwable {
		
		//WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe" );
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://lntsufin.com/buyer/#/home");
		Thread.sleep(5000);
	}
	
	//@AfterMethod
	
	public void close() {
		driver.quit();
		Reporter.log("Browser end", true);
}
}
