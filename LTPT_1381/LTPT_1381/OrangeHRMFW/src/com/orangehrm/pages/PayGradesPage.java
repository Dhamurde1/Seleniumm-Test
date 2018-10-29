package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayGradesPage {
	@FindBy(xpath = ".//*[@id='menu_admin_viewAdminModule']/b")
	private WebElement linkAdmin;
	@FindBy(xpath = ".//*[@id='menu_admin_Job']")
	private WebElement linkJob;
	@FindBy(xpath = ".//*[@id='menu_admin_viewPayGrades']")
	private WebElement linkPayGrades;
	@FindBy(xpath = ".//*[@id='btnAdd']")
	private WebElement buttonAdd;
	@FindBy(xpath = ".//*[@id='payGrade_name']")
	private WebElement txtboxName;
	@FindBy(xpath = ".//*[@id='btnSave']")
	private WebElement buttonSave;
	public PayGradesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void payGrades(String payGradename) {
		linkPayGrades.click();
		buttonAdd.click();

		txtboxName.sendKeys("payGradename");
		buttonSave.click();
	}


}
