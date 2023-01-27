package vidpitch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Videolisting extends Setup{
	
	
@Test
public void checkVideo() throws InterruptedException {
	
	driver.findElement(By.id("email")).sendKeys("Alex.Marsh.ef29da07e45849d49e39950fef72c0ee@mailinator.com");
	driver.findElement(By.id("password")).sendKeys("SK47Bill@n");
	driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();	
driver.findElement(By.xpath("//table/tbody/tr/td[4]/span/button[1]")).click();
driver.findElement(By.xpath("//div/button[@class='mr-3 p-1 btn btn-link btn-sm'][1]")).click();
Thread.sleep(8000);


}

	
	
	

}
