package com.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.UserManagementPage;
import com.orangehrm.utility.ReadDataFromExcel;

public class UserManagementTest extends BaseTest {
	@Test
	public void verifyAddUser() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.Login(ReadDataFromExcel.readData(1,0),ReadDataFromExcel.readData(1,1));
		UserManagementPage addUser = new UserManagementPage(driver);
		String ExpectedValue = addUser.AddUser(ReadDataFromExcel.readData(1, 2), ReadDataFromExcel.readData(1, 3),
				ReadDataFromExcel.readData(1, 4), ReadDataFromExcel.readData(1, 5));
		Assert.assertEquals(addUser.getWTUserNames(ExpectedValue), true);

	}

}
