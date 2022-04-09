package SeleniumAssignmentProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class EdgeDriverExm {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Edge.driver", "E:\\selenium\\Edgedriver_win32\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.bing.com/search?q=google&cvid=5e6dfb13d11a4d1bb9594b36c25427c3&aqs=edge.2.69i57j0l8.5234j0j1&pglt=299&FORM=ANNTA1&PC=DCTS");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//closing the browser
		driver.close();
		//driver.quit();
		
	}

}