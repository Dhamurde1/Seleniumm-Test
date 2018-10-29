package com.orangehrm.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.orangehrm.utility.ReadDataFromExcel;
import com.orangehrm.utility.ReadPropertyFile;

public class BaseTest {
	
	WebDriver driver=null;
	
	@BeforeMethod
	public void openBrowser() throws IOException
	{
		ReadPropertyFile.setPropertyFile();
		ReadDataFromExcel.setupExcel("..\\OrangeHRM_Maven\\src\\test\\resources\\OrangeHRM.xlsx","OrangeHRM");
		String browsername=ReadPropertyFile.getPropertyValue("browsername");		
		if(browsername.equals("FF"))
		{
			driver = new FirefoxDriver();
		}
		else if(browsername.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "..\\OrangeHRM_Maven\\src\\test\\resources\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();	
		}
		else if(browsername.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "..\\OrangeHRM_Maven\\src\\test\\resources\\chromedriver.exe");
		 driver=new ChromeDriver();	
		}
		else 
		{
			System.out.println("Invalid Browser");
		}
				
		driver.get(ReadPropertyFile.getPropertyValue("url"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	     
	}
		
	 @AfterMethod
	 public void closeBrowser()
	 {
		 driver.close();
	 }
	
	 public WebDriver getDriver()
	 {
		 return driver;
	 }
	 
}
