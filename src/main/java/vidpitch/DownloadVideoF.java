package vidpitch;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DownloadVideoF extends Setup{
	
	
	
	
	
@Test
public void dowbloadvideoafterpurchase() throws InterruptedException {
		
		driver.navigate( ).to("https://www.mailinator.com/");
		driver.findElement(By.xpath("//input[@aria-label='Enter public inbox']")).sendKeys("Ingrid.Kennemer.7582f03d567c409caa186b8bd5e64612@mailinator.com");
		driver.findElement(By.xpath("//button[contains(text(),'GO')]")).click();
		driver.findElement(By.xpath("//td[normalize-space()='naveen.mishra@47billion.com']")).click();
		Thread.sleep(2000);

		driver.switchTo().frame(driver.findElement(By.id("html_msg_body")));

		Boolean flag = driver.findElement(By.xpath("//p/a")).isDisplayed();
		Assert.assertTrue(flag);

		driver.findElement(By.xpath("//a[contains(text(),'https://vidpitch-qa.s3.ap-south-1.amazonaws.com/10')]")).click();

		}	
	
	
	
	
	
	
	
	
}
