package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class Screenshot {
	@Test
	public void createcustomertest() throws IOException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://amazon.com");
		EventFiringWebDriver d=new EventFiringWebDriver(driver);
		File srcimg=d.getScreenshotAs(OutputType.FILE);
		File dstfile=new File("C:\\screenshot\\test.png‪");
		FileUtils.copyFile(srcimg, dstfile);
		
	}

}
