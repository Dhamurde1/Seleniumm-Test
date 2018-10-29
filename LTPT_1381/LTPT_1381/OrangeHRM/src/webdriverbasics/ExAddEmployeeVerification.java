package webdriverbasics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExAddEmployeeVerification {
	public static void main(String args[]) throws InterruptedException {
		String ActualEmpID = null;
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Vishnu");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("Vishnu");
		driver.findElement(By.id("btnLogin")).submit();
	
		driver.findElement(By.xpath(".//*[@id='menu_pim_viewPimModule']")).click();
		WebElement linkaddEmployee=driver.findElement(By.xpath(".//*[@id='menu_pim_addEmployee']"));
		WebDriverWait wait=new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.visibilityOf(linkaddEmployee));
				
		linkaddEmployee.click();
		driver.findElement(By.xpath(".//*[@id='firstName']")).sendKeys("Kiran");
		driver.findElement(By.xpath(".//*[@id='lastName']")).sendKeys("Reddy");

		String ExpectedEmpID = driver.findElement(By.xpath(".//*[@id='employeeId']")).getAttribute("value");

		driver.findElement(By.xpath(".//*[@id='btnSave']")).click();
		driver.findElement(By.xpath(".//*[@id='menu_pim_viewEmployeeList']")).click();

		List<WebElement> wtEmpID = driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr/td[2]"));
		int i;
		boolean status = false;
		for (i = 0; i <= wtEmpID.size() - 1; i++) {
			ActualEmpID = wtEmpID.get(i).getText();
			if (ExpectedEmpID.equals(ActualEmpID)) {
				status = true;
				break;
			}

		}

		if (status) {
			System.out.println(ExpectedEmpID + " is matching with " + ActualEmpID + " -->Test Pass");
		} else {
			System.out.println(ExpectedEmpID + " is not matching with " + ActualEmpID + " -->Test Fail");
		}

	}
}