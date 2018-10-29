package webdriveradvanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExMouseHandling {
	
	public static void main(String args[]) throws InterruptedException
	{
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.id("txtUsername")).sendKeys("Vishnu");
	driver.findElement(By.id("txtPassword")).sendKeys("Vishnu");
	driver.findElement(By.id("btnLogin")).click();
	WebElement empinfo=driver.findElement(By.xpath(".//*[@id='employee-information']/a"));
	
	WebElement tipmsg=driver.findElement(By.id("tiptip_content"));
	Actions actions=new Actions(driver);
     actions.moveToElement(empinfo).perform();
     WebDriverWait wait=new WebDriverWait(driver,40);
     wait.until(ExpectedConditions.visibilityOf(tipmsg));   
	 
	 String tooltip=tipmsg.getText();	 
	 System.out.println(tooltip);
}
}