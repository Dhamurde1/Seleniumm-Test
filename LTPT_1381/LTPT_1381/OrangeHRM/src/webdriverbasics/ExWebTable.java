package webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExWebTable {
	public static void main(String args[]) {
		int i;
		int j;
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Vishnu");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("Vishnu");
		driver.findElement(By.id("btnLogin")).submit();
		List<WebElement> wtRows = driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		
		for (i = 1; i <= wtRows.size(); i++) {
			List<WebElement> wtcols = driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr[" + i + "]/td"));
			for (j = 1; j <= wtcols.size(); j++) {
				WebElement cellvalue = driver
						.findElement(By.xpath(".//*[@id='resultTable']/tbody/tr[" + i + "]/td[" + j + "]"));
				System.out.println(cellvalue.getText());
			}
		}

	}
}