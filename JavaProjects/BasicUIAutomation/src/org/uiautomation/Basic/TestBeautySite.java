package org.uiautomation.Basic;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class TestBeautySite {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 WebDriver driver = null;

			String browser = "IE"; //Tools --> Internet Options --> Security --> for all the zones remove 'Enable Protected Mode'
			String ChromeDriverPath = "C:\\Thangakumar\\Development\\Self Projects\\JavaProjects\\External\\chromedriver_win32\\chromedriver.exe";
			String IEDriverPath = "C:\\Thangakumar\\Development\\Self Projects\\JavaProjects\\External\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe";
			
			 if(browser == "Chrome")
			 {
				 System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
				 driver = new ChromeDriver(); 
			 }
			 if(browser == "IE")
			 {
				 System.setProperty("webdriver.ie.driver", IEDriverPath);
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
			
			try {
				Thread.sleep(5000); //Wait time to site load
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				Thread.currentThread().interrupt();
				}
			
			
			driver.findElement(By.id("txtQuantity")).sendKeys("5");
			
			driver.findElement(By.id("altAddToBag")).click();
			
			boolean isDisplayed = driver.findElement(By.id("QtyLmtCntr")).isDisplayed();
			
			Assert.assertTrue(isDisplayed); 
			
			
			
			
		}

	}


