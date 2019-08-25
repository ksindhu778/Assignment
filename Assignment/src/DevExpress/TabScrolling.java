package DevExpress;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabScrolling {

	public static void main(String[] args)  throws Exception
	
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demos.devexpress.com/ASPxNavigationAndLayoutDemos/TabControl/TabScrolling.aspx");
		
		/*String str;
		int k=1;
		for(int r=1;r<50;r++)
		{
		str =driver.findElement(By.xpath("//div[@class='dxtc-sb dxtc-sbDisabled']")).getText();
		if(str.contains("SCHEDULING"))
		{
		
	driver.findElement(By.id("ContentHolder_ASPxPageControl1_SBL")).click();
		}
		k++;
		}*/
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


