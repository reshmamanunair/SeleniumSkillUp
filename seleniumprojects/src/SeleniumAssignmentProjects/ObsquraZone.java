package SeleniumAssignmentProjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ObsquraZone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//max our window
		
				driver.manage().window().maximize();
				
				//get the url of the page
				
				driver.get("https://selenium.obsqurazone.com/index.php");
				//Tagname[@attribute=’value’]
				
				//click the input form
				
				driver.findElement(By.className("nav-link")).click();
				
				//change to xpath
				
				driver.findElement(By.xpath("//a[@href='simple-form-demo.php']")).click();
				Thread.sleep(2000);
				
				//single input field
		
						driver.findElement(By.xpath("//input[@placeholder='Message']")).click();
						driver.findElement(By.xpath("//input[@placeholder='Message']")).sendKeys("Hello");
						driver.findElement(By.cssSelector("button#button-one")).click();//click show message
						System.out.println(driver.findElement(By.cssSelector("button#button-one")).getText());//message show
						System.out.println(driver.findElement(By.cssSelector("div.my-2")).getText());//for getting the text by css (tagename.classname) ie ;YOUR MESSAGE:HELLO
						Thread.sleep(2000);
						
						//two input fields
						
						driver.findElement(By.xpath("//input[@placeholder='Enter Value']")).click();
						driver.findElement(By.xpath("//input[@placeholder='Enter Value']")).sendKeys("12");
						driver.findElement(By.cssSelector("input#value-b")).click();
						driver.findElement(By.cssSelector("input#value-b")).sendKeys("14");
						driver.findElement(By.id("button-two")).click();
						System.out.println(driver.findElement(By.id("button-two")));
						driver.findElement(By.id("message-one")).getText();
						Thread.sleep(2000);
						
						//check box demo
						
						driver.findElement(By.xpath("//a[@href='check-box-demo.php']")).click();
						//or
						//driver.findElement(By.xpath("//li/a[@href='check-box-demo.php']")).click();
						//driver.findElement(By.className("form-check")).click();
						driver.findElement(By.xpath("//input[@type='checkbox']")).click();
						Thread.sleep(2000);
						driver.findElement(By.xpath("//input[@class='check-box-list']")).click();
						Thread.sleep(2000);
						driver.findElement(By.cssSelector("input#check-box-three")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
						Thread.sleep(2000);
						
						
						//radio button demo
						
						driver.findElement(By.xpath("//a[@href='radio-button-demo.php']")).click();
						Thread.sleep(2000);
						driver.findElement(By.cssSelector("input#inlineRadio2")).click();
						Thread.sleep(2000);
						driver.findElement(By.cssSelector("button#button-one")).click();
						Thread.sleep(2000);
						
						//group radio button demo
						
						driver.findElement(By.cssSelector("input#inlineRadio21")).click();
						Thread.sleep(2000);
						driver.findElement(By.xpath("//input[@id='inlineRadio23']")).click();
						Thread.sleep(2000);
						driver.findElement(By.xpath("//button[@id='button-two']")).click();
						Thread.sleep(2000);
						
						//select input

						driver.findElement(By.xpath("//a[@href='select-input.php']")).click();
						//driver.findElement(By.xpath("//select[@id='single-input-field']")).click();
						Thread.sleep(2000);
						/*WebElement sDropDown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
						Select sValue = new Select(sDropDown);
						sValue.selectByValue("Yellow");
						System.out.println(driver.findElement(By.xpath("//div[@id='message-one']")).getText());*/
						//driver.findElement(By.className("my-2")).click();
						
						//for static drop down we need to create object and then store it
						//also we can identify the static by using select keyword
						
						driver.findElement(By.xpath("//option[@value='Red']")).click();
						Thread.sleep(2000);
						
						driver.findElement(By.cssSelector("button#button-all")).click();
						Thread.sleep(2000);
						driver.findElement(By.cssSelector("div#message-two")).click();
						Thread.sleep(2000);
						System.out.println(driver.findElement(By.cssSelector("div#message-two")).getText());
						
						
						//form submit
						
						driver.findElement(By.xpath("//a[@href='form-submit.php']")).click();
						Thread.sleep(2000);
						driver.findElement(By.cssSelector("input#validationCustom01")).click();
						driver.findElement(By.cssSelector("input#validationCustom01")).sendKeys("Reshma");
						
						driver.findElement(By.xpath("//input[@placeholder='Last name']")).click();
						driver.findElement(By.xpath("//input[@placeholder='Last name']")).sendKeys("nair");
						
						driver.findElement(By.xpath("//input[@id='validationCustomUsername']")).click();
						driver.findElement(By.xpath("//input[@id='validationCustomUsername']")).sendKeys("reshmanair");
						
						driver.findElement(By.cssSelector("input#validationCustom03")).click();
						driver.findElement(By.cssSelector("input#validationCustom03")).sendKeys("arora");
						
						driver.findElement(By.id("validationCustom04")).click();
						driver.findElement(By.id("validationCustom04")).sendKeys("colorado");
						
						driver.findElement(By.xpath("//input[@placeholder='Zip']")).click();
						driver.findElement(By.xpath("//input[@placeholder='Zip']")).sendKeys("20231");
						
						driver.findElement(By.xpath("//input[@type='checkbox']")).click();
						driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
						
						//ajax form submit
						
						driver.findElement(By.xpath("//a[@href='ajax-form-submit.php']")).click();
						driver.findElement(By.id("subject")).click();
						driver.findElement(By.id("subject")).sendKeys("selenium");
						driver.findElement(By.xpath("//textarea[@placeholder='Description']")).click();
						driver.findElement(By.xpath("//textarea[@placeholder='Description']")).sendKeys("selenium in java");
						driver.findElement(By.xpath("//input[@value='Submit']")).click();
						
						//jquery select2
						
						//driver.findElement(By.xpath("//a[@href='jquery-select.php']")).click();
						//driver.findElement(By.xpath("//span[@class='select2-selection__arrow']")).click();
						
						//driver.findElement(By.xpath("//input[@type='search']")).click();
						//driver.findElement(By.xpath("//input[@type='search']")).sendKeys("c");
						//driver.findElement(By.xpath("//span[@title='Colorado']")).click();//want to check it
						//driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple']")).click();
						//driver.findElement(By.xpath("//span[@id='select2-states-uj-container-choice-p0w8-CO']")).click();
						//driver.findElement(By.xpath("//span[@id='select2-states-uj-container-choice-szbf-FL']")).click();
						
						//driver.findElement(By.xpath("(//span[@class='select2-selection__arrow'])[2]")).click();
						//We are storing  the dynamic drop down options in a list
						/*List<WebElement> options = driver.findElements(By.xpath("//li[@class='select2-selection__arrow']"));
						//iterating through the list
						for(WebElement option:options)
						{
							//finding the correct match from the list
							if(option.getText().equalsIgnoreCase("colorado"));
							{
								//clicking on the option
								option.click();
								Thread.sleep(3000);
								break;
							}
						}
						
						
						
						List<WebElement> optionss = driver.findElements(By.xpath("//li[@role='options']"));
						//iterating through the list
						for(WebElement optionn:optionss)
						{
							//finding the correct match from the list
							if(optionn.getText().equalsIgnoreCase("Indiana"));
							{
								//clicking on the option
								optionn.click();
								Thread.sleep(3000);
								break;
								
							}
		}*/
	//driver.close();
						driver.findElement(By.xpath("(//a[@href='drag-drop.php'])[1]")).click();
										
						Actions act=new Actions(driver);
						act.dragAndDrop((driver.findElement(By.xpath("//span[@style='background: white;']"))),(driver.findElement(By.id("mydropzone")))).build().perform();
						
						
	}
	}
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
				
				