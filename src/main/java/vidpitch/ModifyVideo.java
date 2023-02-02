package vidpitch;

import static org.testng.Assert.assertEquals;
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

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModifyVideo extends Setup {
	
	
	String broker = "piyush soni";
	String Address = "Crystal IT Park 4th floor";

	@Test
	
	public void modify() throws InterruptedException{
		driver.findElement(By.id("email")).sendKeys("Paul.Hoge.c22ea63617ef480d86d7437a5ee77470@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("SK47Bill@n");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//table/tbody/tr/td[1]")).click();
		driver.findElement(By.xpath("//a[@type='button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[3]/button/img")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("BROKER_NAME")).sendKeys(Keys.CONTROL,Keys.chord("A"),Keys.DELETE);
		driver.findElement(By.name("BROKER_NAME")).sendKeys("piyush soni");
		driver.findElement(By.xpath("//input[@label='Broker Office Full Address']")).sendKeys(Keys.CONTROL,Keys.chord("A"),Keys.DELETE);
		driver.findElement(By.xpath("//input[@label='Broker Office Full Address']")).sendKeys("Crystal IT Park 4th floor");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Yes, Render')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(240));
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@type='button']"))).click();
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		
		String getbrokername= driver.findElement(By.xpath("//input[@label='Broker Name']")).getAttribute("value");
		System.out.println(getbrokername);
		Assert.assertEquals(getbrokername, broker);
	    String getaddress = driver.findElement(By.xpath("//input[@label='Broker Office Full Address']")).getAttribute("value");
	    Assert.assertEquals(getaddress, Address);
	}
	
	
	
	
	
	
	
	
}
