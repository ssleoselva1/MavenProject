package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IESample {
	private WebDriver driver;
	
	@Test				
	
	public void testEasy1() throws InterruptedException {	
		System.setProperty("webdriver.ie.driver", "C:\\Selenium_Support\\IEDriverServer.exe");
	    driver = new InternetExplorerDriver();  
		driver.get("https://www.guru99.com/");  
		Thread.sleep(300);
		String title = driver.getTitle();
		System.out.print(title);
				
		
	}	
	@BeforeTest
	public void beforeTest() {	
		System.setProperty("webdriver.ie.driver", "C:\\Selenium_Support\\IEDriverServer.exe");
	    driver = new InternetExplorerDriver(); 
	}		
	@AfterTest
	public void afterTest() {
		//driver.close();
		//driver.quit();			
	}	

}
