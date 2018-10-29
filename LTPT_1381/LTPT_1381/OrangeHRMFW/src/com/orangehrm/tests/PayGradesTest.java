package com.orangehrm.tests;

import org.testng.annotations.Test;


import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.PayGradesPage;
import com.orangehrm.utility.ReadDataFromExcel;

public class PayGradesTest extends BaseTest {
	@Test
	public void verifyPayGradesTest()
	{
		LoginPage loginpage=new LoginPage(getDriver());
		loginpage.Login(ReadDataFromExcel.readData(1,0),ReadDataFromExcel.readData(1,1));
		PayGradesPage payGrade=new PayGradesPage(getDriver());
		payGrade.payGrades(ReadDataFromExcel.readData(1,7));
		
	}

}
