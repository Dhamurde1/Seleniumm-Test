package com.orangehrm.tests;


import org.testng.annotations.Test;

import com.orangehrm.pages.EmploymentStatusPage;
import com.orangehrm.pages.LoginPage;

import com.orangehrm.utility.ReadDataFromExcel;

public class EmploymentStatusTest extends BaseTest {
	@Test
	public void verifyEmploymentStatusTest()
	{
		LoginPage loginpage=new LoginPage(getDriver());
		loginpage.Login(ReadDataFromExcel.readData(1,0),ReadDataFromExcel.readData(1,1));
		EmploymentStatusPage empStatus=new EmploymentStatusPage(getDriver());
		empStatus.employmentStatus(ReadDataFromExcel.readData(1,8));
		
	}

	
	
}
