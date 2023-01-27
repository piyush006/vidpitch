package vidpitch;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginF extends Setup{
	
	
@Test
	
	public void test() {
		
	driver.findElement(By.id("email")).sendKeys("Ingrid.Kennemer.7582f03d567c409caa186b8bd5e64612@mailinator.com");
	driver.findElement(By.id("password")).sendKeys("SK47Bill@n");
	driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
	driver.findElement(By.xpath("//span[@class='user-circle rounded-circle']")).click();
	String roleA = driver.findElement(By.xpath("//p/b")).getText();
	Assert.assertEquals(roleA, roleE);
	
	}		
	
	
	
	
	
	

}
