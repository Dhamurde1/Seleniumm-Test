package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void dropdownSelectByVisibleText(WebElement element,String text)
	{
		Select dropdown=new Select(element);
		dropdown.selectByVisibleText(text);
	}
}
