package vidpitch;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DownloadVideoF {
	
	
	@Test
	public void DownloadVideo() throws InterruptedException {
	WebDriver	driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\47Billion\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	 driver.get("https://www.mailinator.com/");
		
	    driver.findElement(By.id("search")).sendKeys("Jonathan.Shirazi.44e1f3fd052b4c508b095bf09a378ffc@mailinator.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'GO')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[normalize-space()='naveen.mishra@47billion.com']")).click();
		Thread.sleep(2000);

	driver.switchTo().frame(driver.findElement(By.id("html_msg_body")));

	Thread.sleep(3000);
	driver.findElement(By.xpath("//p/a")).click();
	
	Thread.sleep(2000);
	ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
	
	System.out.println(wid.size());
	//switch to active tab
	driver.switchTo().window(wid.get(1));
	System.out.println("Piyush");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[contains(text(),'Download Video')]")).click();	
	
	
	
	
	
}
	

}
