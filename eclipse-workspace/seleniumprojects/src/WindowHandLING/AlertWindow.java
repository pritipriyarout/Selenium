package WindowHandLING;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertWindow {

	public static void main(String[] args) 
	{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://desktop-vssmu77/login.do");
	//login
	
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("pwd")).sendKeys("manager");
    driver.findElement(By.id("loginButton")).click();
    
    //click on user img
    driver.findElement(By.xpath("//div[text()='Users']")).click();
    //click on user name
    driver.findElement(By.linkText("Tallewar, Mohini (Mohini)")).click();
    driver.findElement(By.xpath("//input[@value='Delete This User']")).click();
    
    //pass control to alert
    Alert alt=driver.switchTo().alert();
    //capture the alert msg
    System.out.println(alt.getText());
    //click on ok button
    alt.accept();
    
    
	
	

	}

}
