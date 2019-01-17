package GenericLib;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClasss {
	public static WebDriver driver;
	FileUtils lib=new FileUtils();
	@BeforeClass
	public void configBc()
	{
	Properties pobj=lib.getPropertiesFileObj();
	String bname=pobj.getProperty("browser");
	if(bname.equals("firefox"))
	{
		FirefoxDriver driver=new FirefoxDriver();
	}
	else if(bname.equals("chrome"))
	{
	System.setProperty("WebDriver.Chrome.driver", "./resorce/Chromedriver.exe")	;
	driver=new ChromeDriver();
	}
	}
	@BeforeMethod
	public void configBM()
	{
		Properties pobj=lib.getPropertiesFileObj();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(pobj.getProperty("url"));
		
	
		

	}

}
