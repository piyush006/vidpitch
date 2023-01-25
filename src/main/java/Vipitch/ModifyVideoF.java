package Vipitch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModifyVideoF extends Setup{
	String broker = "piyush soni";
	String Address = "Crystal IT Park 4th floor";

	@Test
	
	public void modify() throws InterruptedException{
	driver.findElement(By.id("email")).sendKeys("Rob.Goldberg.800a8853905840839364cd3cc27b23a5@mailinator.com");
	driver.findElement(By.id("password")).sendKeys("SK47Bill@n");
	driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
	driver.findElement(By.xpath("//table/tbody/tr/td[1]")).click();
	driver.findElement(By.xpath("//a[@type='button']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[3]/button/img")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	driver.findElement(By.name("BROKER_NAME")).sendKeys(Keys.CONTROL,Keys.chord("A"),Keys.DELETE);
	driver.findElement(By.name("BROKER_NAME")).sendKeys("piyush soni");
	driver.findElement(By.xpath("//input[@label='Broker Office Full Address']")).sendKeys(Keys.CONTROL,Keys.chord("A"),Keys.DELETE);
	driver.findElement(By.xpath("//input[@label='Broker Office Full Address']")).sendKeys("Crystal IT Park 4th floor");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'Yes, Render')]")).click();
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(180));
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
