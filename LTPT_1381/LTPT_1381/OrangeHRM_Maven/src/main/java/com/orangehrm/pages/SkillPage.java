package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillPage {
	@FindBy(xpath = ".//*[@id='menu_admin_viewAdminModule']/b")
	private WebElement linkAdmin;
	@FindBy(xpath = ".//*[@id='menu_admin_Qualifications']")
	private WebElement linkQualifications;
	@FindBy(xpath = ".//*[@id='menu_admin_viewSkills']")
	private WebElement linkSkills;
	@FindBy(xpath = ".//*[@id='btnAdd']")
	private WebElement buttonAdd;
	@FindBy(xpath = ".//*[@id='skill_name']")
	private WebElement txtboxSkillname;
	@FindBy(xpath = ".//*[@id='skill_description']")
	private WebElement txtboxDescription;
	@FindBy(xpath = ".//*[@id='btnSave']")
	private WebElement buttonSave;
	
	public SkillPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public String Skill(String skillname) {
		linkAdmin.click();
		linkQualifications.click();
		linkSkills.click();
		buttonAdd.click();
		txtboxSkillname.sendKeys(skillname);
		buttonSave.click();
		return skillname;
	}

}
