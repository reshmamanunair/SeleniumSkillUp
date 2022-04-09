package seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeInSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//max our window
		
				driver.manage().window().maximize();
				
				//get the url of the page
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
//differnt ways to get into the iframe
				//ID,ANME,INDEX,
				
				//Making some changes

	}

}
