package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EducationPage {
	@FindBy(xpath = ".//*[@id='menu_admin_viewAdminModule']/b")
	private WebElement linkAdmin;
	@FindBy(xpath = ".//*[@id='menu_admin_Qualifications']")
	private WebElement linkQualifications;
	@FindBy(xpath = ".//*[@id='menu_admin_viewEducation']")
	private WebElement linkEducation;
	@FindBy(xpath = ".//*[@id='btnAdd']")
	private WebElement buttonAdd;
	@FindBy(xpath = ".//*[@id='education_name']")
	private WebElement txtboxLevel;
	@FindBy(xpath = ".//*[@id='btnSave']")
	private WebElement buttonSave;
	
	public EducationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String Education(String level) {
		linkAdmin.click();
		linkQualifications.click();
		linkEducation.click();
		buttonAdd.click();

		txtboxLevel.sendKeys("level");
		buttonSave.click();
		return level;
	}
	

}