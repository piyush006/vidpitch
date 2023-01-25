package Vipitch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Excel.utility.Xls_Reader;

public class Setup {
	
	WebDriver driver;
	String project;	
	String roleE = "Vidpitch Broker";
		
	
		
		


	@Parameters("browserName")

	@BeforeMethod
	public void setup(String browserName ) {
		
	 
		 
		 if (browserName.equalsIgnoreCase("chrome")) {
		    driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Users\\47Billion\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://vidpitchqa.47billion.com/");
				    		
			}
		 
		 else if(browserName.equalsIgnoreCase("firefox")){
			 System.setProperty("webdriver.firefox.marionette", "C:\\software\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
		        driver = new FirefoxDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		        driver.get("https://vidpitchqa.47billion.com/");
		        
			 
		 }
	 }	
	
	
	
	
	

	@AfterMethod
	public void tearDown() {
		
	driver.quit();
	}	
	
	
	
	
	

}
