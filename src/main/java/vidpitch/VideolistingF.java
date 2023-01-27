package vidpitch;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class VideolistingF extends Setup{
	@Test
	public void checkVideo() throws InterruptedException {
		
		driver.findElement(By.id("email")).sendKeys("Ingrid.Kennemer.7582f03d567c409caa186b8bd5e64612@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("SK47Bill@n");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();	
	driver.findElement(By.xpath("//table/tbody/tr/td[4]/span/button[1]")).click();
	driver.findElement(By.xpath("//div/button[@class='mr-3 p-1 btn btn-link btn-sm'][1]")).click();
	Thread.sleep(8000);


	}
}
