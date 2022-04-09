package seleniumprojects;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestNgParameter {
@Parameters({"URL"})
@Test
public void demo(String siteurl) {
	
	System.out.println(siteurl);
}
}
