package webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExDeleteButtonStatuswithWT {
	public static void main(String args[]) {
		int i;		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Vishnu");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("Vishnu");
		driver.findElement(By.id("btnLogin")).submit();
		
		List<WebElement> wtchekboxes = driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr/td[1]"));
		int count=0;
		for (i = 0; i <= wtchekboxes.size()-1; i++) {
			if(wtchekboxes.get(i).isSelected())
			{
				count=count+1;
			}
		}
		
		if(count==0)
		{
			
			boolean btnstatus=driver.findElement(By.xpath(".//*[@id='btnDelete']")).isEnabled();
		    if(!btnstatus)
		    {
		    	System.out.println("Delete button disabled=" +btnstatus + "=Tets Pass");
		    }
		    else
		    {
		    	System.out.println("Delete button Enabled=" +btnstatus + "=Tets Fail");
		    }
					
					
		}	
	
	}
}
