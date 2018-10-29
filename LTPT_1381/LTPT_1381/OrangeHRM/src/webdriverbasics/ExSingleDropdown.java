package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ExSingleDropdown {
	public static void main(String args[]) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Vishnu");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("Vishnu");
		driver.findElement(By.id("btnLogin")).submit();	
		Select jobTitle=new Select(driver.findElement(By.id("empsearch_job_title")));
		jobTitle.selectByVisibleText("Test Engineer");
		driver.findElement(By.xpath(".//*[@id='searchBtn']")).click();
		
		
		
	}
	
}
