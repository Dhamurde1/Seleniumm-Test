package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {
	@FindBy(xpath=".//*[@id='txtUsername']")
	private WebElement txtboxUserName;
	
	@FindBy(xpath=".//*[@id='txtPassword']")
	private WebElement txtboxPassword;
	
	@FindBy(xpath=".//*[@id='btnLogin']")
	private WebElement buttonLogin;
	
	@FindBy(xpath=".//*[@id='spanCopyright']")
	private WebElement footerText;
	
	@FindBy(partialLinkText="Welcome")
	private WebElement linkWelcome;
	
	@FindBy(linkText="Logout")
	private WebElement linkLogout;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void Login(String Uname,String Pwd)
	{
		txtboxUserName.sendKeys(Uname);
		txtboxPassword.sendKeys(Pwd);
		buttonLogin.click();
	}
	
	public String getFooterText()
	{
		return footerText.getText();
	}
	
	public void Logout()
	{
		linkWelcome.click();
		linkLogout.click();
	}
	
}
