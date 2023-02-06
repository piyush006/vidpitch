package vidpitch;

import org.openqa.selenium.By;

import java.io.IOException;
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
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Setup{
	
@Test
	
	public void loging() throws IOException {
	
	Propertiesefile get = new Propertiesefile();
		
	driver.findElement(By.id("email")).sendKeys(get.getemailchrome());
	driver.findElement(By.id("password")).sendKeys("SK47Bill@n");
	driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
	driver.findElement(By.xpath("//span[@class='user-circle rounded-circle']")).click();
	String roleA = driver.findElement(By.xpath("//p/b")).getText();
	Assert.assertEquals(roleA, roleE);
		
		
	
	}	
	
	
	
	
	

}
