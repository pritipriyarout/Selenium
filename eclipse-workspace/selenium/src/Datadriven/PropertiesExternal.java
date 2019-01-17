package Datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesExternal {

	public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./dataread.properties");
	Properties pobj=new Properties();
	pobj.load(fis);
	String user=pobj.getProperty("username");
	String password=pobj.getProperty("password");
	String url=pobj.getProperty("url");
	System.out.println(user);
	System.out.println(password);
	System.out.println(url);
	WebDriver driver=new FirefoxDriver();
	driver.get(url);
	driver.findElement(By.name("username")).sendKeys(user);
	driver.findElement(By.name("pwd")).sendKeys(password);
	driver.findElement(By.id("loginButton")).click();

	
	

	}

}
