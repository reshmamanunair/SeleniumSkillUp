package seleniumprojects;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//path of the driver
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
//invoking the browser
		ChromeDriver driver=new ChromeDriver();
		//ChromeDriver driver=new FirefoxDriver();
		//WebDriver Driver=new ChromeDriver();
//accessing the url
driver.get("http://www.google.co.in/");
//or
//driver.navigate().to("http://www.google.co.in/");
//driver.getTitle();
System.out.println(driver.getTitle());
//driver.getCurrentUrl();
System.out.println(driver.getCurrentUrl());
//closing the browser
driver.close();
//driver.quit();
driver.resetInputState();//firefox and edge class has no knowledge of this



	}

}
