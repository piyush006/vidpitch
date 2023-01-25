package Vipitch;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Setup{
	
@Test
	
	public void test() {
		
	driver.findElement(By.id("email")).sendKeys("Kris.Johnston.1786f2c86a0f4527b6f877e32cd46553@mailinator.com");
	driver.findElement(By.id("password")).sendKeys("SK47Bill@n");
	driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
	driver.findElement(By.xpath("//span[@class='user-circle rounded-circle']")).click();
	String roleA = driver.findElement(By.xpath("//p/b")).getText();
	Assert.assertEquals(roleA, roleE);
	
	}	
	
	
	
	
	

}
