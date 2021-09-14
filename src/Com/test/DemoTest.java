package Com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {
	ChromeDriver driver;
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/panther/Downloads/Driver/chromedriver");
		driver= new ChromeDriver();
		
	
	}
	
	public void GoToAnyWebSite(String url) {
		driver.get(url);
	
		
	}
	public void clickonanyelement(By by) {
		driver.findElement(by).click();
		
		
	}
	
	public void TypeAnyElement(By by, String value) {
		driver.findElement(by).sendKeys(value);
	}
	
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

	
		
	
	

}
