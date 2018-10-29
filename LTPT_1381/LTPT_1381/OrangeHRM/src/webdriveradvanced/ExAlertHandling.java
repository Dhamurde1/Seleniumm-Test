package webdriveradvanced;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExAlertHandling {

	public static void main(String args[])
	{
		FirefoxDriver driver=new FirefoxDriver();		
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("");
		driver.findElement(By.name("txtPassword")).sendKeys("");
		driver.findElement(By.name("Submit")).click();
		
		Alert alert=driver.switchTo().alert();
		
		String ActualMsg=alert.getText();
		
		if(ActualMsg.equals("User Name not given!"))
		{
			System.out.println("Displaying correct message as" +ActualMsg+ "-Test Pass" );
			alert.accept();
		}
		else
		{
			System.out.println("Displaying incorrect message as" +ActualMsg+ "-Test Fail" );
		}
		
		
	}
}
