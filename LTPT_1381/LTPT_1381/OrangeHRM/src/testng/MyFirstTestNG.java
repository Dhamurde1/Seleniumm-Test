package testng;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstTestNG extends BaseTest{

	
 @Test(priority=2)
  public void verifyUserManagement() {
	 System.out.println("Hi,This is my first TestNg Class");
  }
 
 @Test(priority=1)
 public void verifyOptionalFields() {
	 System.out.println("Hi,This is my second TestNg Class");
 }
 
 @Test(priority=3)
 public void verifyAddEmployee() {
	 System.out.println("Hi,This is display");
 }
 

 
}
