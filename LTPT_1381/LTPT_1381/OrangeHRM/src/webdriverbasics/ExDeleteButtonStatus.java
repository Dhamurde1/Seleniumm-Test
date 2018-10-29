package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExDeleteButtonStatus {
	public static void main(String args[]) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Vishnu");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("Vishnu");
		driver.findElement(By.id("btnLogin")).submit();
		WebElement buttonDelete=driver.findElement(By.xpath(".//*[@id='btnDelete']"));
		
		if(buttonDelete.isEnabled())
		{
			System.out.println("Button is Enabled");
		}
		else
		{
			System.out.println("Button is Disabled");
		}
		
		
	}
}
