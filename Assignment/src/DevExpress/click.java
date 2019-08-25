package DevExpress;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class click extends mainClass 
{



	@Test
	@Parameters({"browser"})
	public void click() throws Exception
	{
		driver.findElement(By.linkText("SCHEDULING")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("REPORTING")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("NAVIGATION & LAYOUT")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("DATA")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("COMPONENTS")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("COMMON CONTROLS")).click();
		Thread.sleep(2000);
	
	}

}
