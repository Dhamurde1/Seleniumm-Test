package webdriverbasics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ExBrowserCommands {
	public static void main(String args[]) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		System.out.println("Page Title is:" + driver.getTitle());
		System.out.println("Current URL is:" + driver.getCurrentUrl());
		System.out.println("Source code is:" + driver.getPageSource());
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.close();
		driver.quit();
	}
}
