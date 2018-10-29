package webdriverwithjava;

import org.testng.annotations.Test;

public class OrangeHRMMain {

	@Test
	public void addEmployee() {
		
		OrangeHRMLogin login = new OrangeHRMLogin();
		OrangeHRMAddEmployee addemployee = new OrangeHRMAddEmployee();

		login.openBrowser();
		login.Login();
		addemployee.navigatePIM();
		addemployee.navigateEmployeeList();
		String ExpectedEmpID = addemployee.addEmployee();
		addemployee.verifyRecordInWT(ExpectedEmpID);
		
	}
	
	@Test
	public void searchEmployee() {
		
		OrangeHRMLogin login = new OrangeHRMLogin();
		OrangeHRMAddEmployee addemployee = new OrangeHRMAddEmployee();

		
		addemployee.navigatePIM();
		addemployee.navigateEmployeeList();
		String ExpectedEmpID = addemployee.addEmployee();
		addemployee.verifyRecordInWT(ExpectedEmpID);
		login.Logout();
		login.closeBrowser();
	}
}
