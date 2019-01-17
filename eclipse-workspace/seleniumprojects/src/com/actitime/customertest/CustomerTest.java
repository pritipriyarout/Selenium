package com.actitime.customertest;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.actitime.genericlib.FileUtils;

public class CustomerTest {

	public static void main(String[] args)throws Throwable{
		FileUtils fip=new FileUtils();
		/*read the common data from properties*/
		Properties pobj=fip.getPropertiesFileobj();
		String url=pobj.getProperty("url");
		String user=pobj.getProperty("username");
		String pwd=pobj.getProperty("password");
		/*read the data from excel*/
		String customerName=fip.getExcelData("sheet1", 1, 2);
		String customerDesc=fip.getExcelData("sheet1", 1,3);
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://desktop-vssmu77/login.do");
		driver.findElement(By.name("username")).sendKeys(user);
	    driver.findElement(By.name("pwd")).sendKeys(pwd);
		
		

	}

}
