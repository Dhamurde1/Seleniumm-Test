package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ExAddEmployeeFieldsVerification {
	public static void main(String args[]) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Vishnu");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("Vishnu");
		driver.findElement(By.id("btnLogin")).submit();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='menu_pim_viewPimModule']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='menu_pim_addEmployee']")).click();
		driver.findElement(By.xpath(".//*[@id='firstName']")).sendKeys("Kiran");
		driver.findElement(By.xpath(".//*[@id='lastName']")).sendKeys("Reddy");
		WebElement chkboxCreateLogin = driver.findElement(By.xpath(".//*[@id='chkLogin']"));
		chkboxCreateLogin.click();
		if (chkboxCreateLogin.isSelected()) {
			System.out.println("Create Login Checkbox Selected");
			WebElement Username = driver.findElement(By.xpath(".//*[@id='user_name']"));
			WebElement password = driver.findElement(By.xpath(".//*[@id='user_password']"));
			WebElement repassword = driver.findElement(By.xpath(".//*[@id='re_password']"));
			WebElement status = driver.findElement(By.xpath(".//*[@id='status']"));
			if (Username.isDisplayed()) {
				System.out.println("Username is disaplyed");
				Username.sendKeys("Jagan");
				if (password.isDisplayed()) {
					System.out.println("password is disaplyed");
					password.sendKeys("Jagan");
					if (repassword.isDisplayed()) {
						System.out.println("repassword is disaplyed");
						repassword.sendKeys("Jagan");
						if (status.isDisplayed()) {
							System.out.println("Status is disaplyed");
							Select drpdown = new Select(status);
							drpdown.selectByVisibleText("Enabled");
							driver.findElement(By.xpath(".//*[@id='btnSave']")).click();
						} else {
							System.out.println("Status is not disaplyed");
						}
					} else {
						System.out.println("repassword is not disaplyed");
					}
				} else {
					System.out.println("password is not disaplyed");
				}
			} else {
				System.out.println("Username is not disaplyed");
			}
		} else {
			System.out.println("Create Login Checkbox not Selected");
		}
	}
}