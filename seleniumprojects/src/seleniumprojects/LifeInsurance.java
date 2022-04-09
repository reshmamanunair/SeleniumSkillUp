package seleniumprojects;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LifeInsurance {
	@BeforeMethod

	public void beforemethod() {
		
		System.out.println("Before Method will execute before every test method");
	}
	@BeforeTest

	public void before() {
		
		System.out.println("i run first for life insurance");
	}
	@Test(groups= {"Reg"})
	public void WebLoginLife() {
		System.out.println("life insurance web login");
	}
	@Test(groups= {"Reg"})
	public void WebLogoutLife() {
		System.out.println("life insurance web logout");
	}
	@Test
	public void MobileLoginLife() {
		System.out.println("life insurance mobile login");
	}
	@Test
	public void APILogin() {
		System.out.println("life insurance APIlogin");
	}
	@AfterTest
	public void after() {
		
		System.out.println("after all life insurance testcases");
	}
	@AfterMethod
	public void afterMethod() {
	System.out.println("After Method will execute after every test method ");
	}
}
