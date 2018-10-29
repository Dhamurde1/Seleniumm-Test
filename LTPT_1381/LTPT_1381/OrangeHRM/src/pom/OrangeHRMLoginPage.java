package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginPage {

	@FindBy(xpath=".//*[@id='txtUsername']")
	private WebElement txtboxUserName;
	
	@FindBy(xpath=".//*[@id='txtPassword']")
	private WebElement txtboxPassword;
	
	@FindBy(xpath=".//*[@id='btnLogin']")
	private WebElement buttonLogin;
	
	OrangeHRMLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Login()
	{
		txtboxUserName.sendKeys("Vishnu");
		txtboxPassword.sendKeys("Vishnu");
		buttonLogin.click();
	}
	
}
