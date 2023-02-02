package vidpitch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CheckGIFC extends Setup{

	
	@Test
	public void checkVideo() throws InterruptedException {
		
		driver.findElement(By.id("email")).sendKeys("Allan.Meadors.6c27047adda547018cf45743df31d479@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("SK47Bill@n");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//table/tbody/tr/td[4]/span/button[2]")).click();
		
		
		
	
		
		
		WebDriverWait flag = new WebDriverWait(driver,Duration.ofSeconds(40));
		boolean flag1 = flag.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-content']"))).isDisplayed();
		Assert.assertTrue(flag1);
		
		}	
	
	
	
	
	
	
	
}
