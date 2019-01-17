package Jenkinsdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Jenkins {
	@Test
	public void Testfb()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
	}
	
}
