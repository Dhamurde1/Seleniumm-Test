package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmploymentStatusPage {
	@FindBy(xpath = ".//*[@id='menu_admin_viewAdminModule']/b")
	private WebElement linkAdmin;
	@FindBy(xpath = ".//*[@id='menu_admin_Job']")
	private WebElement linkJob;
	@FindBy(xpath = ".//*[@id='menu_admin_employmentStatus']")
	private WebElement linkEmploymentStatus;
	@FindBy(xpath = ".//*[@id='btnAdd']")
	private WebElement buttonAdd;
	@FindBy(xpath = ".//*[@id='empStatus_name']")
	private WebElement txtboxName;
	@FindBy(xpath = ".//*[@id='btnSave']")
	private WebElement buttonSave;
	public EmploymentStatusPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void employmentStatus(String empStatus) {
		linkEmploymentStatus.click();
		buttonAdd.click();

		txtboxName.sendKeys("empStatus");
		buttonSave.click();
	}


}
