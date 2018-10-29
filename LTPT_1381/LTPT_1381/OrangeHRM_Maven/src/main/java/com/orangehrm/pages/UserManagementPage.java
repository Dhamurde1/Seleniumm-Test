package com.orangehrm.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserManagementPage extends BasePage {
	@FindBy(xpath = ".//*[@id='menu_admin_viewAdminModule']/b")
	private WebElement linkAdmin;
	@FindBy(xpath = ".//*[@id='menu_admin_UserManagement']")
	private WebElement linkUserManagement;
	@FindBy(xpath = ".//*[@id='btnAdd']")
	private WebElement buttonAdd;
	@FindBy(xpath = ".//*[@id='systemUser_userType']")
	private WebElement dropdownUserRole;
	@FindBy(xpath = ".//*[@id='systemUser_employeeName_empName']")
	private WebElement txtboxEmployeeName;
	@FindBy(xpath = ".//*[@id='systemUser_userName']")
	private WebElement txtboxUserName;
	@FindBy(xpath = ".//*[@id='systemUser_status']")
	private WebElement dropdownStatus;
	@FindBy(xpath = ".//*[@id='systemUser_password']")
	private WebElement txtboxPassword;
	@FindBy(xpath = ".//*[@id='systemUser_confirmPassword']")
	private WebElement txtboxConfirmPassword;
	@FindBy(xpath = ".//*[@id='btnSave']")
	private WebElement buttonSave;
	@FindBy(xpath = "	.//*[@id='resultTable']/tbody/tr/td[2]")
	private List<WebElement> WTUserNames;

	public UserManagementPage(WebDriver driver) {
		super(driver);
	}

	public List<WebElement> getWTUserNames(String expectedValue) {
		return getWTUserNames(expectedValue);
	}

	public String AddUser(String ename, String uname, String pswd, String confirmpswd) {
		linkAdmin.click();
		linkUserManagement.click();
		buttonAdd.click();
		dropdownSelectByVisibleText(dropdownUserRole, "Admin");
		txtboxEmployeeName.sendKeys(ename);
		txtboxEmployeeName.sendKeys(uname);
		dropdownSelectByVisibleText(dropdownStatus, "Enabled");
		txtboxEmployeeName.sendKeys(pswd);
		txtboxEmployeeName.sendKeys(confirmpswd);
		buttonSave.click();
		return "vishnu";

	}

	

}
