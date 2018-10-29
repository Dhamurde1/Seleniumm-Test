package com.orangehrm.tests;

import org.testng.annotations.Test;

import com.orangehrm.pages.JobTitlesPage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.utility.ReadDataFromExcel;

public class JobTitlesTest extends BaseTest{
	@Test
	public void verifyJobTitlesTest()
	{
		LoginPage loginpage=new LoginPage(getDriver());
		loginpage.Login(ReadDataFromExcel.readData(1,0),ReadDataFromExcel.readData(1,1));
		JobTitlesPage jobtitle=new JobTitlesPage(getDriver());
		jobtitle.jobTitle(ReadDataFromExcel.readData(1,6));
		
	}
	

}
