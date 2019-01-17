package testNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class Screenshot {
@Test
public void createcustomerTest() throws IOException
{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://amazon.com");
	//capture the screenshots
	EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
	File srcImg=edriver.getScreenshotAs(OutputType.FILE);
	File dstfile=new File("E:\\screenshot\\testscreen.png");
	//copy the file
	FileUtils.copyFile(srcImg, dstfile);
	
}
}
 