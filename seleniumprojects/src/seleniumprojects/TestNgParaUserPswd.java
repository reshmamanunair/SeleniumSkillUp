package seleniumprojects;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParaUserPswd {
	public class TestNgParameter {
		@Parameters({"URL" ,"Username" ,"password"})
		@Test
		public void demo(String siteurl,String Username, String password) {
			
			System.out.println(siteurl);
			System.out.println(Username);
			System.out.println(password);
		}
		}
}
