package vidpitch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
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

public class CheckGIFF extends Setup{
	
	
	@Test
	public void checkgiff() throws InterruptedException {
		
		driver.findElement(By.id("email")).sendKeys("Stacy.VierheiligFraser.e226dd0f5e7d4651932ecb2370c05d94@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("SK47Bill@n");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//table/tbody/tr/td[4]/span/button[2]")).click();
		
		
		
	
	
		
		WebDriverWait flag = new WebDriverWait(driver,Duration.ofSeconds(40));
		boolean flag1 = flag.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-content']"))).isDisplayed();
		Assert.assertTrue(flag1);
		
		}	
	
	
	
	
	
	

}
