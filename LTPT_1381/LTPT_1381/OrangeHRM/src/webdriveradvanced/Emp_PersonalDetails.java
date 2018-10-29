package webdriveradvanced;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Emp_PersonalDetails 
{

public static WebDriver driver;
	
	public static void main(String args[])
	{
	
		try
		{
			WebDriver driver=new FirefoxDriver();

            driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");

            driver.findElement(By.id("txtUsername")).sendKeys("Vishnu");

            driver.findElement(By.id("txtPassword")).sendKeys("Vishnu");

            driver.findElement(By.id("btnLogin")).click();
      
            driver.findElement(By.linkText("Isaac")).click();
            
           List<WebElement> fields= driver.findElement(By.xpath("//form[@id='frmEmpPersonalDetails']/fieldset")).findElements(By.tagName("input"));
           System.out.print(fields.size());
           
           ArrayList<Boolean> status=new ArrayList<Boolean>();
           for(int i=0;i<=fields.size()-2;i++)
           {
        	   String field=fields.get(i).getAttribute("type");
        	   Boolean field2=fields.get(i).isEnabled();
        	   status.add(field2);
        	   System.out.println(field+" "+field2);
           }
           
           if(status.contains("true"))
           {
        	   System.out.print("Test Case Failed");
           }
           else
           {
        	   System.out.print("Test Case Passed");
           }                
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

