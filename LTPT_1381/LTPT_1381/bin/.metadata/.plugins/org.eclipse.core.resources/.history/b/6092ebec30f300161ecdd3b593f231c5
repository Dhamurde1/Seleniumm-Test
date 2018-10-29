package com.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.pages.LoginPage;


public class LoginTest extends BaseTest {

	@Test
	public void verifyFooterText()
	{
		LoginPage loginpage=new LoginPage(getDriver());		
		Assert.assertEquals(loginpage.getFooterText(), "OrangeHRM ver 3.0.1 © OrangeHRM Inc. 2005 - 2017 All rights reserved.");
		
	}
}
