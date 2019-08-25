package DevExpress;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


@Test
public class Scroll extends mainClass
{
	  	
	  @Test	
	  @Parameters({"browser"})
	  public void retesting(String str) throws Exception
	  {
		  if(str.matches("firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver","D:\\Sel_wk_july\\myproj\\geckodriver.exe");
			  driver=new ChromeDriver();
		  }
		  if(str.matches("chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver","D:\\Sel_wk_july\\myproj\\chromedriver.exe");
			   driver=new ChromeDriver();
		  }
	  }
	  @Test
	public void  scroll() throws Exception
	{
		
	
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://demos.devexpress.com/ASPxNavigationAndLayoutDemos/TabControl/TabScrolling.aspx");

	  for(int i=1;i<5;i++)
		{
		driver.findElement(By.id("ContentHolder_ASPxPageControl1_SBL")).click();
		}
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


