package seleniumprojects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobertforSelenium {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//max our window
		
				driver.manage().window().maximize();
				
				//get the url of the page
				driver.get("https://www.qabible.in/payrollapp/");
				driver.findElement(By.id("loginform-username")).click();
				driver.findElement(By.id("loginform-username")).sendKeys("carol");
				driver.findElement(By.id("loginform-password")).sendKeys("1q2w3e4r");
				driver.findElement(By.name("login-button")).click();
				Thread.sleep(3000);
				driver.findElement(By.linkText("Invoice")).click();
				driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-paperclip']")).click();
				Thread.sleep(3000);
				//robort class is not a part of selenium .it is a part of java
				//robert class is used for getting the access to keyboard keys ie,cntrl+v =paste
				Robot rb=new Robot();
				rb.keyPress(KeyEvent.VK_CONTROL);    //keypress is used to press the key in keyboard and instead of pressing the control key simply we use VK_control
				rb.keyPress(KeyEvent.VK_S);
				
				rb.keyPress(KeyEvent.VK_CONTROL);   //keyrelease is used to release the key
				rb.keyPress(KeyEvent.VK_S);
				Thread.sleep(3000);
				rb.keyPress(KeyEvent.VK_ENTER);
				
				
	}

}
