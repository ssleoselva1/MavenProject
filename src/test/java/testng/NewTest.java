package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;
	
	@Test				
	public void testEasy() throws InterruptedException {	
		driver.get("https://www.amazon.in/");  
		Thread.sleep(300);
		String title = driver.getTitle();
		System.out.print(title);
				
	}	
	
	@BeforeTest
	public void beforeTest() {	
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium_Support\\geckodriver.exe");
	    driver = new FirefoxDriver();  
	}		
	@AfterTest
	public void afterTest() {
		//driver.close();
		//driver.quit();			
	}	

}
