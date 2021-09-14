package Com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;

public class TestCasses {
	public void targettest() throws InterruptedException {
		DemoTest demoTest= new DemoTest();
		demoTest.openBrowser();
		demoTest.GoToAnyWebSite("https://www.target.com/");
		demoTest.clickonanyelement(By.xpath("//div[@id='header']/nav/a[3]"));
		demoTest.clickonanyelement(By.xpath("//div[@id='header']/nav/a[4]"));
		demoTest.clickonanyelement(By.xpath("//div[@id='header']/nav/a[5]"));
		demoTest.clickonanyelement(By.xpath("//div[@id='header']/nav/a[6]"));
		demoTest.clickonanyelement(By.xpath("//input[@id='search']"));
		Thread.sleep(3000);
		demoTest.TypeAnyElement(By.xpath("//input[@id='search']"), "iphone"+Keys.ENTER);
		Thread.sleep(3000);
		demoTest.clickonanyelement(By.xpath("//a[@aria-label='Consumer Cellular Apple iPhone XR (64GB) - Black']"));
		

		demoTest.closeBrowser();
		
		
	}

}
