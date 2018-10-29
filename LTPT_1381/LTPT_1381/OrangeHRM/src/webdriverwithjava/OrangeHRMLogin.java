package webdriverwithjava;

import org.openqa.selenium.By;

public class OrangeHRMLogin extends OrangeHRMBase{
	
	
	void Login()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Vishnu");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("Vishnu");
		driver.findElement(By.id("btnLogin")).submit();
	}
	
	void Logout()
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	

	
}
