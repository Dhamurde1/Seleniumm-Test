package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	  
	@BeforeMethod
	public void openBrowser()
	{
		 System.out.println("OPen Browser");
	}
		
	 @AfterMethod
	 public void closeBrowser()
	 {
		 System.out.println("Close Browser");
	 }
}
