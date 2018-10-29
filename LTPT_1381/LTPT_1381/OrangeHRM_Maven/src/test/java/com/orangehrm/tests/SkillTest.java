package com.orangehrm.tests;


import org.testng.annotations.Test;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.SkillPage;
import com.orangehrm.utility.ReadDataFromExcel;

public class SkillTest extends BaseTest {
	@Test
	public void verifySkillTest ()
	{
		LoginPage loginpage=new LoginPage(getDriver());
		loginpage.Login(ReadDataFromExcel.readData(1,0),ReadDataFromExcel.readData(1,1));
		SkillPage empStatus=new SkillPage(getDriver());
		empStatus.Skill(ReadDataFromExcel.readData(1,8));
		
	}

	

}
