package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExFooterText {
	public static void main(String args[])
	{
		FirefoxDriver driver=new FirefoxDriver();		
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		String FooterMsg=driver.findElement(By.xpath(".//*[@id='spanCopyright']")).getText();
		if(FooterMsg.equals("OrangeHRM ver 3.0.1 © OrangeHRM Inc. 2005 - 2017 All rights reserved."))
		{
			System.out.println(FooterMsg + "is displaying as correct-Test Pass");
		}
		else
		{
			System.out.println(FooterMsg + "is displaying as incorrect-Test Fail");
		}
	}
}
