package seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//max our window
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/flights");
		//driver.findElement(By.xpath("(//div/select)[1])")).click();
		WebElement Sdrop=driver.findElement(By.xpath("(//div/select)[1])"));
		Select dropdown=new Select(Sdrop);
		//select by index
		dropdown.selectByIndex(2);
		
		//select by value
		dropdown.selectByValue("4");
		//select by visible text
		//dropdown.selectByVisibleText("9");
		
		
		
	}

}
