package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ExMultiDropdown {
	public static void main(String args[]) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Vishnu");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("Vishnu");
		driver.findElement(By.id("btnLogin")).submit();
		driver.findElement(By.xpath(".//*[@id='menu_admin_viewAdminModule']")).click();
		driver.findElement(By.xpath(".//*[@id='menu_admin_Job']")).click();
		driver.findElement(By.xpath(".//*[@id='menu_admin_workShift']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAdd']")).click();
		driver.findElement(By.xpath(".//*[@id='workShift_name']")).sendKeys("Day2");
		driver.findElement(By.xpath(".//*[@id='workShift_hours']")).sendKeys("8");
		Select availableEmployees = new Select(driver.findElement(By.xpath(".//*[@id='workShift_availableEmp']")));
		availableEmployees.selectByVisibleText("Praveen Kumar");
		availableEmployees.selectByValue("211");
		availableEmployees.selectByIndex(5);
		availableEmployees.deselectAll();
		driver.findElement(By.xpath(".//*[@id='btnAssignEmployee']")).click();

	}
}
