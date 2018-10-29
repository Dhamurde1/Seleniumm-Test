package webdriveradvanced;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExWindowHandling {
	public static void main(String args[])	
	{
	
		FirefoxDriver driver=new FirefoxDriver();		
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		System.out.println(driver.getWindowHandle());
		String mainwindow=driver.getWindowHandle();
		
		driver.findElement(By.xpath(".//*[@id='spanSocialMedia']/a[1]/img")).click();
		
		System.out.println(driver.getWindowHandles());
		
		Set<String> windows=driver.getWindowHandles();
		
		
		for(String currentwindow:windows)
		{
			//System.out.println(driver.getTitle());			
			if(!mainwindow.equals(currentwindow))
			{
				
				driver.switchTo().window(currentwindow);
				System.out.println(driver.getTitle());
				
				String title=driver.getTitle();
				if(title.equals("Sign Up | LinkedIn"))
				{
				
				driver.findElement(By.xpath(".//*[@id='first-name']")).sendKeys("Vishnu");
				driver.close();
				}
			}
			else
			{
				driver.switchTo().window(mainwindow);
			}
		}
		
		driver.switchTo().window(mainwindow);
		driver.findElement(By.xpath(".//*[@id='spanSocialMedia']/a[2]/img")).click();
		
	}
}
