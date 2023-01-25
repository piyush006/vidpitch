package Vipitch;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginF extends Setup{
	
	
@Test
	
	public void test() {
		
	driver.findElement(By.id("email")).sendKeys("Rob.Goldberg.800a8853905840839364cd3cc27b23a5@mailinator.com");
	driver.findElement(By.id("password")).sendKeys("SK47Bill@n");
	driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
	driver.findElement(By.xpath("//span[@class='user-circle rounded-circle']")).click();
	String roleA = driver.findElement(By.xpath("//p/b")).getText();
	Assert.assertEquals(roleA, roleE);
	
	}		
	
	
	
	
	
	

}
