package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobTitlesPage {
	@FindBy(xpath = ".//*[@id='menu_admin_viewAdminModule']/b")
	private WebElement linkAdmin;
	@FindBy(xpath = ".//*[@id='menu_admin_Job']")
	private WebElement linkJob;
	@FindBy(xpath = ".//*[@id='menu_admin_viewJobTitleList']")
	private WebElement linkJobTitles;
	@FindBy(xpath = ".//*[@id='btnAdd']")
	private WebElement buttonAdd;
	@FindBy(xpath = "	.//*[@id='jobTitle_jobTitle']")
	private WebElement txtboxJobTitle;
	@FindBy(xpath = ".//*[@id='jobTitle_jobDescription']")
	private WebElement txtboxJobDescription;
	@FindBy(xpath = ".//*[@id='jobTitle_jobSpec']")
	private WebElement txtboxJobSpecification;

	@FindBy(xpath = ".//*[@id='jobTitle_note']")
	private WebElement txtboxNotes;
	@FindBy(xpath = ".//*[@id='btnSave']")
	private WebElement buttonSave;

	public JobTitlesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void jobTitle(String jobTitle) {
		linkJobTitles.click();
		buttonAdd.click();

		txtboxJobTitle.sendKeys("jobTitle");
		buttonSave.click();
	}

}
