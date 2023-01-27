package vidpitch;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DownloadVideo extends Setup{
	
	
	
	@Test
	public void dowbloadvideoafterpurchase() throws InterruptedException {
			
			driver.navigate( ).to("https://www.mailinator.com/");
			driver.findElement(By.xpath("//input[@aria-label='Enter public inbox']")).sendKeys("Alex.Marsh.ef29da07e45849d49e39950fef72c0ee@mailinator.com");
			driver.findElement(By.xpath("//button[contains(text(),'GO')]")).click();
			driver.findElement(By.xpath("//td[normalize-space()='naveen.mishra@47billion.com']")).click();
			Thread.sleep(2000);

			driver.switchTo().frame(driver.findElement(By.id("html_msg_body")));

			Boolean flag = driver.findElement(By.xpath("//p/a")).isDisplayed();
			Assert.assertTrue(flag);

			driver.findElement(By.xpath("//a[contains(text(),'https://vidpitch-qa.s3.ap-south-1.amazonaws.com/10')]")).click();

			}	
		
		
}
