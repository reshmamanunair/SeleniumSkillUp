package seleniumprojects;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomeInsurance {
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("i am going to execute first from suite level");
	}
@Test(priority=-3,groups= {"Reg"})
public void WebLoginHome() {
	System.out.println("home insurance web login");
}
@Test(priority=3,groups= {"Reg"})
public void WebLogoutHome() {
	System.out.println("home insurance web logout");
}
@Test(priority=-2)
public void MobileLoginHome() {
	System.out.println("home insurance mobile login");
}
//enabled =false wont pick that particular method
@Test(enabled=false)
public void APILoginHome() {
	System.out.println("home insurance APIlogin");
}
@AfterSuite
public void aftersuite()
{
	System.out.println("i am going to execute last from suite level");
}
}
