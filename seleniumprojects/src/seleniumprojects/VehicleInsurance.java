package seleniumprojects;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VehicleInsurance 
{
	@Test(groups= {"Reg"})
	public void WebLoginVehicle() {
		System.out.println("vehicle insurance web login");
	}
	@Test(groups= {"Reg"})
	public void WebLogoutVehicle() {
		System.out.println("vehicle insurance web logout");
	}
	@Test
	public void MobileLoginVehicle() {
		System.out.println("vehicle insurance mobile login");
	}
	@Test
	public void APILoginVehicle() {
		System.out.println("vehicle insurance APIlogin");
	//hard assert
		Assert.assertTrue(false);
	}
	
}