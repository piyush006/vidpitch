package vidpitch;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Setup{
	
@Test
	
	public void test() {
		
	driver.findElement(By.id("email")).sendKeys("Alex.Marsh.ef29da07e45849d49e39950fef72c0ee@mailinator.com");
	driver.findElement(By.id("password")).sendKeys("SK47Bill@n");
	driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
	driver.findElement(By.xpath("//span[@class='user-circle rounded-circle']")).click();
	String roleA = driver.findElement(By.xpath("//p/b")).getText();
	Assert.assertEquals(roleA, roleE);
	
	}	
	
	
	
	
	

}
