package vidpitch;


import java.util.List;
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

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PurchaseVideo extends Setup{
	
	

@Test
	
public void modify() throws InterruptedException{

driver.findElement(By.id("email")).sendKeys("Randy.Hoye.57f3448f758b4ee0944ad0632b733ae6@mailinator.com");
driver.findElement(By.id("password")).sendKeys("SK47Bill@n");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
driver.findElement(By.xpath("//table/tbody/tr/td[1]")).click();
driver.findElement(By.id("PurchaseVideo")).click();
driver.findElement(By.id("shippingAddress.name")).sendKeys("Piyush");
driver.findElement(By.id("shippingAddress.address.line1")).sendKeys("Crystal IT Park 4th floor");

driver.findElement(By.xpath("//option[@value='India']")).click();
driver.findElement(By.id("shippingAddress.address.city")).sendKeys("Newyork");
driver.findElement(By.id("shippingAddress.address.postal_code")).sendKeys("46500");
driver.findElement(By.id("setBillingFields")).click();
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,100)","");
Thread.sleep(3000);

int allframes = driver.findElements(By.tagName("iframe")).size();
System.out.println(allframes);

driver.switchTo().frame(driver.findElement(By.tagName("iframe")));


driver.findElement(By.xpath("//input[@placeholder='1234 1234 1234 1234']")).sendKeys("4242424242424242");
driver.findElement(By.id("Field-expiryInput")).sendKeys("0224");
driver.findElement(By.id("Field-cvcInput")).sendKeys("123");

driver.switchTo().defaultContent();

Thread.sleep(3000);

driver.findElement(By.xpath("//span[@id='button-text']")).click();
Thread.sleep(4000);




}
}
