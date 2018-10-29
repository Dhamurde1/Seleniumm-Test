package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {

	@FindBy(xpath=".//*[@id='menu_pim_viewPimModule']")
	private WebElement linkPIM;
	
	@FindBy(xpath=".//*[@id='menu_pim_addEmployee']")
	private WebElement linkAddEmployee;
	
	@FindBy(xpath=".//*[@id='firstName']")
	private WebElement textboxFirstName;
	
	@FindBy(xpath=".//*[@id='lastName']")
	private WebElement textboxLastName;
	
	@FindBy(xpath=".//*[@id='employeeId']")
	private WebElement textboxEmpId;
	
	@FindBy(xpath=".//*[@id='btnSave']")
	private WebElement buttonSave;
	
	
	
	
	public AddEmployeePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToPIM()
	{
		try
		{
		linkPIM.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String addEmployee(String Fname,String Lname)
	{	
		String ExpectedEmpID=null;
		try
		{
		linkAddEmployee.click();
		textboxFirstName.sendKeys(Fname);
		textboxLastName.sendKeys(Lname);		
		ExpectedEmpID=textboxEmpId.getAttribute("value");
		buttonSave.click();		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ExpectedEmpID;
		
	}	
	
	
}
