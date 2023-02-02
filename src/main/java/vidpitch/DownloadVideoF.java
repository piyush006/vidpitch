package vidpitch;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DownloadVideoF extends Setup{
	
	
	@Test
	public void DownloadVideo() throws InterruptedException {	
	 driver.navigate().to("https://www.mailinator.com/");
		
	    driver.findElement(By.id("search")).sendKeys("Brian.BocciSIOR.0a631f8a91004ca7b86e461b53b4e4ef@mailinator.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'GO')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[normalize-space()='naveen.mishra@47billion.com']")).click();
		Thread.sleep(2000);

	driver.switchTo().frame(driver.findElement(By.id("html_msg_body")));

	Thread.sleep(3000);
	driver.findElement(By.xpath("//p/a")).click();
	Thread.sleep(2000);
	ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
	//switch to active tab
	driver.switchTo().window(wid.get(1));
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[contains(text(),'Download Video')]")).click();	
	
	
	
	
	
}
	

}
