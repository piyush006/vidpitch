package vidpitch;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

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
	public void setup(String browserName ) throws IOException {
		
		Propertiesefile get = new Propertiesefile();
		 
		 if (browserName.equalsIgnoreCase("chrome")) {
			//specify the location of properties file
				
		    driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Users\\47Billion\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get(get.geturl());
			
			
				    		
			}
		 
		 
		 else if(browserName.equalsIgnoreCase("firefox")){
			 
			 
			//specify the location of properties file
				
				
				
			 System.setProperty("webdriver.firefox.marionette", "C:\\software\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
		        driver = new FirefoxDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		        
				driver.get(get.geturl());
				
			 
		 }
	 }	
	
	
	
	
	

	@AfterMethod
	public void tearDown() {
		
	driver.quit();
	}	
	
	
	
	
	

}
