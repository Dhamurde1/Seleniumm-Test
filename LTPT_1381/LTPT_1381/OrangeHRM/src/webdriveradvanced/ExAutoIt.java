package webdriveradvanced;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExAutoIt {
	public static void main(String args[]) throws InterruptedException, IOException {
	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Vishnu");
		driver.findElement(By.id("txtPassword")).sendKeys("Vishnu");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='menu_pim_viewPimModule']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='menu_pim_addEmployee']")).click();
		driver.findElement(By.xpath(".//*[@id='firstName']")).sendKeys("Praveen");
		driver.findElement(By.xpath(".//*[@id='lastName']")).sendKeys("Kumar");
		
		driver.findElement(By.xpath(".//*[@id='photofile']")).click();
		
		Thread.sleep(5000);
		Runtime.getRuntime().exec("..\\OrangeHRM\\resources\\FileUpload1.exe");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='btnSave']")).click();
		
	}
}
