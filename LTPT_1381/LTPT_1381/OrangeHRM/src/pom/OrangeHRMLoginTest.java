package pom;

import org.testng.annotations.Test;

public class OrangeHRMLoginTest extends BaseTest {

	@Test
	public void verifyFunctionalityForLogin()
	{
		OrangeHRMLoginPage loginpage=new OrangeHRMLoginPage(getDriver());
		loginpage.Login();
	}
}
