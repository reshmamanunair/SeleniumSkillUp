package SeleniumAssignmentProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragNdDropDemo {
	public class DragDropSample {

		@Test
		public void demoDrag() {


			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		WebElement source1 = driver.findElement(By.xpath("//div[@id='box1']"));// oslo
		WebElement source2 = driver.findElement(By.xpath("//div[@id='box2']"));// stockholm
		WebElement source3 = driver.findElement(By.xpath("//div[@id='box3']"));// washington
		WebElement source4 = driver.findElement(By.xpath("//div[@id='box4']"));// cophenhagen
		WebElement source5 = driver.findElement(By.xpath("//div[@id='box5']"));// seol
		WebElement source6 = driver.findElement(By.xpath("//div[@id='box6']"));// italy
		WebElement source7 = driver.findElement(By.xpath("//div[@id='box7']"));// madrid//oslo

		WebElement destination1 = driver.findElement(By.xpath("//div[@id='box101']"));// norway
		WebElement destination2 = driver.findElement(By.xpath("//div[@id='box102']"));// sweden
		WebElement destination3 = driver.findElement(By.xpath("//div[@id='box103']"));// us
		WebElement destination4 = driver.findElement(By.xpath("//div[@id='box104']"));// denmark
		WebElement destination5 = driver.findElement(By.xpath("//div[@id='box105']"));// southkorea
		WebElement destination6 = driver.findElement(By.xpath("//div[@id='box106']"));// itay
		WebElement destination7 = driver.findElement(By.xpath("//div[@id='box107']"));// spain

		Actions act = new Actions(driver);
		act.clickAndHold(source1).moveToElement(destination1).release().build().perform();
		act.clickAndHold(source2).moveToElement(destination2).release().build().perform();
		act.clickAndHold(source3).moveToElement(destination3).release().build().perform();
		act.clickAndHold(source4).moveToElement(destination4).release().build().perform();
		act.clickAndHold(source5).moveToElement(destination5).release().build().perform();
		act.clickAndHold(source6).moveToElement(destination6).release().build().perform();
		act.clickAndHold(source7).moveToElement(destination7).release().build().perform();// spain madrid

		}

		}


}
