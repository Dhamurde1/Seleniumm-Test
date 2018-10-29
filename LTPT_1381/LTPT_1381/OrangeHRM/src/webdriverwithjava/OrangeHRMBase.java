package webdriverwithjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class OrangeHRMBase {

	WebDriver driver=null;
	void openBrowser()
	{
		
		String browsername="IE";		
		if(browsername.equals("FF"))
		{
			driver = new FirefoxDriver();
		}
		else if(browsername.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "..\\OrangeHRM\\resources\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();	
		}
		else if(browsername.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "..\\OrangeHRM\\resources\\chromedriver.exe");
		 driver=new ChromeDriver();	
		}
		else 
		{
			System.out.println("Invalid Browser");
		}
				
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
	
	}
	
	void closeBrowser()
	{
		driver.close();
	}
}
