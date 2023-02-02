package vidpitch;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DownloadVideoF {
	
	
	@Test
	public void DownloadVideo() throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette", "C:\\software\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	 driver.get("https://www.mailinator.com/");
		
	    driver.findElement(By.id("search")).sendKeys("John.Hill.d00fd3afd2ad449782f3b6f62d6a47a1@mailinator.com");
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
	//switch to active tab
	driver.switchTo().window(wid.get(1));
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[contains(text(),'Download Video')]")).click();	
	
	
	
	
	
}
	

}
