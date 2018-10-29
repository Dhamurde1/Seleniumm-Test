package com.orangehrm.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EmployeeListPage {

	@FindBy(xpath = ".//*[@id='menu_pim_viewEmployeeList']")
	private WebElement linkEmployeeList;

	@FindBy(xpath = ".//*[@id='resultTable']/tbody/tr/td[2]")
	private List<WebElement> WTEmpIds;

	@FindBy(xpath = ".//*[@id='resultTable']/tbody/tr/td[1]")
	private List<WebElement> WTCheckboxes;

	@FindBy(xpath = ".//*[@id='btnDelete']")
	private WebElement buttonDelete;

	public EmployeeListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
 
	
	
	
	public void navigateToEmployeelist() {
		linkEmployeeList.click();
	}

	public int getcheckboxCount() {
		int count = 0;
		try{			
			for (WebElement chkbox : WTCheckboxes) {
				if (chkbox.isSelected()) {
					count = count + 1;
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return count;
	}
	
	

	public boolean verifyDeletebuttonStatus() {
		boolean btnStatus = false;
        try
        {
		if (buttonDelete.isEnabled()) {
			btnStatus = true;
		}
        }
        catch(Exception e)
		{
			e.printStackTrace();
		}
		return btnStatus;
	}
	
	public boolean verifyRecordinWT(String Expectedvalue) {

		String Actualvalue = null;
		boolean status = false;
		try
		{		
		for (WebElement id : WTEmpIds) {
			Actualvalue = id.getText();
			if (Actualvalue.equals(Expectedvalue)) {
				status = true;
				break;
			}
		}
		}
		 catch(Exception e)
			{
				e.printStackTrace();
			}
		return status;
	}
	
	
	
}
