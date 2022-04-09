package seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsInSelenium {
//move to element=mousehover
	//double click
	//context click=right click
	//move by offset
	//drag and drop
	@Test
	public void ActDemo() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();//to cancel the pop up
		Thread.sleep(3000);
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("mobile");
		driver.findElement(By.xpath("//img[@title='Flipkart']")).click();
		Thread.sleep(3000);
		Actions act =new Actions(driver);//actions already in selenium press ctrl to see
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"))).build().perform();//or split it ie act.build().perform(); 
	
		//we can execute with only by .perform().ie before means old days we use .build().perform()
		// to move mouse (mousehover)
		//driver.findElement(By.className("xtXmba"))
		
	    act.moveToElement(driver.findElement(By.linkText("Cameras & Accessories"))).perform();
		act.moveToElement(driver.findElement(By.linkText("DSLR & Mirrorless"))).click().perform();
		act.doubleClick(driver.findElement(By.name("q"))).perform();
		act.moveToElement(driver.findElement(By.xpath("//img[@title='Flipkart']"))).click().perform();
						//act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Electronics')]")))
						//.moveToElement(driver.findElement(By.linkText("Cameras & Accessories")))
                         //.perform
						//build().perform();
						//can execute this only with build();
						//driver.findElement(By.className("xtxmba"))
	}
	
	
}
