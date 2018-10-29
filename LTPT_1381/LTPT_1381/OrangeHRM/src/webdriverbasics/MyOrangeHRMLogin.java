package webdriverbasics;

import oops.MyFirefoxDriver;
import oops.MyInternetExplorerDriver;
import oops.MyWebDriver;


public class MyOrangeHRMLogin {
	public static void main(String args[])
	{
		
		String browsername="IE";
		MyWebDriver driver=null;;
		
		if(browsername.equals("FF"))
		{
			driver=new MyFirefoxDriver();
		}
		else if(browsername.equals("IE"))
		{
			driver=new MyInternetExplorerDriver();
		}
		else
		{
			System.out.println("Invalid Browser");
		}
	    driver.myGet();
	    driver.myFindElement();
	    driver.myNavigate();
	    driver.myClose();
	}
}
