package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindinfXpath {
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone x",Keys.ENTER);
String x=driver.findElement(By.xpath("//div[text()='Apple iPhone X (Space Gray, 64 GB)']/../../div[2]/div[1]/div/div")).getText();
	System.out.println(x);
	}
	
	

}
