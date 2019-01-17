package seleniumtool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyErrorMsg {

	public static void main(String[] args)throws Throwable {
		String expTitle="Gmail";
		String expErrormsg="Couldn't find your Google Account";
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		String actTitle=driver.getTitle();
		if(expTitle.equals(actTitle))
		{
		System.out.println("gmail page is verified==PASS");
		
		}
		else
		{
			System.out.println("gmail page is verified==FAIL");
	}
	driver.findElement(By.id("identifierId")).sendKeys("hh");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(2000);
	WebElement wb=driver.findElement(By.xpath("//div[@ class='dEOOab RxsGPe'][1]"));
	String actMsg=wb.getText();
	if(expErrormsg.equals(actMsg))
	{
		System.out.println("error msg is verified==PASS");
	}
	else
	{
		System.out.println("errormsg is not verified==FAIL");
		}
		
	String color=wb.getCssValue("color");
	System.out.println(color);
	driver.close();}
		

	}



