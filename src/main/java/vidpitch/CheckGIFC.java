package vidpitch;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CheckGIFC extends Setup{

	
	
	@Test
	public void checkGifg() throws InterruptedException, IOException {
		
		Propertiesefile get = new Propertiesefile();
		
		
		driver.findElement(By.id("email")).sendKeys(get.getemailchrome());
		driver.findElement(By.id("password")).sendKeys("SK47Bill@n");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//table/tbody/tr/td[4]/span/button[2]")).click();
		
		
		
	
		
		
		WebDriverWait flag = new WebDriverWait(driver,Duration.ofSeconds(40));
		boolean flag1 = flag.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-content']"))).isDisplayed();
		Assert.assertTrue(flag1);
		
		}	
	
	
	
	
	
	
	
}
