package seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertLnSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//max our window
		
				driver.manage().window().maximize();
				
				//get the url of the page
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
				Thread.sleep(3000);
				driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
				//THIS IS INSIDE IFRAME SO WE NEED TO SWITCH TO IFRAME FIRST
				driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
				
				//iframe is noting a url inside one url ie when we open the news page it has another page like twitter
				//to exit from iframe we use this
				//driver.switchTo().defaultContent();
				//or
				//driver.switchTo().parentFrame();
				String alertmsg =driver.switchTo().alert().getText();
				System.out.println(alertmsg);
				
				//to accept the alert ie click ok we use accept()
				//driver.switchTo().alert().accept();
				
				//to cancel the alert we use dismiss()
				//driver.switchTo().alert().dismiss();
				
				driver.switchTo().alert().sendKeys("selenium");
				driver.switchTo().alert().accept();
				driver.switchTo().defaultContent();
				driver.findElement(By.xpath("//a[@id='getwebsitebtn']")).click();
				//Making some changes to commit via git bash
				
				
	}

}
