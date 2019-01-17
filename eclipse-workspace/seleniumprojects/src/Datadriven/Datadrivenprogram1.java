package Datadriven;


import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Datadrivenprogram1 {

	public static void main(String[] args) throws Throwable{

	    FileInputStream fis=new FileInputStream("./Datadriven.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String user=pobj.getProperty("username");
		String psw=pobj.getProperty("password");
		String URL=pobj.getProperty("url");
		System.out.println(user);
		System.out.println(psw);
		System.out.println(URL);
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://desktop-vssmu77/login.do");
		driver.findElement(By.name("username")).sendKeys(user);
	    driver.findElement(By.name("pwd")).sendKeys(psw);
		
		
		

	}

}
