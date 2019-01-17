package ParallelExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseeClass {
public WebDriver driver;
@Parameters("browser")
@BeforeClass
public void configBc(String bName)
{
	if (bName.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(bName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","./resource/chromedriver.exe");
		 driver=new ChromeDriver();
	}
}
		 
	
	@BeforeMethod
	public void configBM()
	{
		System.out.println("login");System.out.println("login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://desktop-vssmu77/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.id("loginButton")).click();
	}
	@AfterMethod
	public void configAM()
	{
		System.out.println("logout");
		driver.findElement(By.id("logoutLink")).click();
	}
	@AfterClass
	public void configAC()
	{
		System.out.println("---------close browser");
		driver.close();
	    		
	}



		
	}

