package org.uiautomation.JunitSamples;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class JUnitSampleTest1 {

	@Before
	public void beforeEachTestCases()	{
		System.out.println("Before each method is called !");
	}
	
	@After
	public void afterEachTestCases(){
		System.out.println("After each method is called !");
	}
	
	@BeforeClass
	public static void beforeAllTestCases()	{
		System.out.println("Before all method is called !");
	}
	
	@AfterClass
	public static void afterAlltheTestCases(){
		System.out.println("After all the methods is called !");
	}	
	
	@Test
	public void TestShoppingCart(){
		
		System.out.println("Executing TestShoppingCart !");

		 WebDriver driver = null;

			String browser = "Firefox";
			
			 if(browser == "Chrome")
			 {
				 System.setProperty("webdriver.chrome.driver", "C:\\Thangakumar\\Exercise\\Java\\Automation\\External\\chromedriver_win32\\chromedriver.exe");
				 driver = new ChromeDriver(); 
			 }
			 if(browser == "IE")
			 {
				 System.setProperty("webdriver.ie.driver", "C:\\Thangakumar\\Exercise\\Java\\Automation\\External\\IEDriverServer\\IEDriverServer.exe");
				 driver = new InternetExplorerDriver(); 
			 }
			 if(browser == "Firefox")
			 {			 
				 driver = new FirefoxDriver(); 
			 }	
				
					
			driver.navigate().to("http://www.drugstore.com");		
			driver.manage().window().maximize();
			
			
			try {
				Thread.sleep(1000); //Wait time to site load
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				Thread.currentThread().interrupt();
				}
			
			driver.findElement(By.id("sc184941")).click();		
			driver.findElement(By.id("txtSearchBox_1")).sendKeys("lipstick");		
			driver.findElement(By.id("btnGoSearch_1")).click();
			
			WebElement sortBy = driver.findElement(By.id("cmbProdSort"));
			Select sortByDropDown = new Select(sortBy);
			sortByDropDown.selectByVisibleText("Customer Rating");
			
			driver.findElement(By.xpath("//*[@id='prodImg411132']")).click();
			
			driver.findElement(By.id("txtQuantity")).clear();
			
			driver.findElement(By.id("txtQuantity")).sendKeys("5");
			
			driver.findElement(By.id("altAddToBag")).click();
			
		   boolean isValid = driver.findElement(By.id("emptyBagTitle")).getText() == "SHOPPING BAG";
		   
		   Assert.assertTrue(isValid);		   
	}
	
	@Test
	public void ValidateCheckoutMaxLimit() {
		
		System.out.println("Executing ValidateCheckoutMaxLimit !");

		 WebDriver driver = null;

			String browser = "Firefox";
			
			 if(browser == "Chrome")
			 {
				 System.setProperty("webdriver.chrome.driver", "C:\\Thangakumar\\Exercise\\Java\\Automation\\External\\chromedriver_win32\\chromedriver.exe");
				 driver = new ChromeDriver(); 
			 }
			 if(browser == "IE")
			 {
				 System.setProperty("webdriver.ie.driver", "C:\\Thangakumar\\Exercise\\Java\\Automation\\External\\IEDriverServer\\IEDriverServer.exe");
				 driver = new InternetExplorerDriver(); 
			 }
			 if(browser == "Firefox")
			 {			 
				 driver = new FirefoxDriver(); 
			 }	
				
					
			driver.navigate().to("http://www.drugstore.com");		
			driver.manage().window().maximize();
			
			
			try {
				Thread.sleep(1000); //Wait time to site load
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				Thread.currentThread().interrupt();
				}
			
			driver.findElement(By.id("sc184941")).click();		
			driver.findElement(By.id("txtSearchBox_1")).sendKeys("lipstick");		
			driver.findElement(By.id("btnGoSearch_1")).click();
			
			WebElement sortBy = driver.findElement(By.id("cmbProdSort"));
			Select sortByDropDown = new Select(sortBy);
			sortByDropDown.selectByVisibleText("Customer Rating");
			
			driver.findElement(By.xpath("//*[@id='prodImg411132']")).click();
			
			driver.findElement(By.id("txtQuantity")).sendKeys("5");
			
			driver.findElement(By.id("altAddToBag")).click();
			
			boolean isDisplayed = driver.findElement(By.id("QtyLmtCntr")).isDisplayed();
			
			Assert.assertTrue(isDisplayed); 
			
	}


}
