package webdriverwithjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRMAddEmployee extends OrangeHRMBase {

	void navigatePIM()
	{
		driver.findElement(By.xpath(".//*[@id='menu_pim_viewPimModule']")).click();
	}
	
	void navigateEmployeeList()
	{
		driver.findElement(By.xpath(".//*[@id='menu_pim_viewEmployeeList']")).click();
	}
		
	String addEmployee()
	{
		
		WebElement linkaddEmployee=driver.findElement(By.xpath(".//*[@id='menu_pim_addEmployee']"));
		WebDriverWait wait=new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.visibilityOf(linkaddEmployee));
				
		linkaddEmployee.click();
		driver.findElement(By.xpath(".//*[@id='firstName']")).sendKeys("Kiran");
		driver.findElement(By.xpath(".//*[@id='lastName']")).sendKeys("Reddy");

		String ExpectedEmpID = driver.findElement(By.xpath(".//*[@id='employeeId']")).getAttribute("value");

		driver.findElement(By.xpath(".//*[@id='btnSave']")).click();
		return ExpectedEmpID;
	}
	
	
	void verifyRecordInWT(String ExpectedEmpID)
	{
		String ActualEmpID=null;
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
