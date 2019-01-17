package seleniumtool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorProgram {

	public static void main(String[] args) throws Throwable
	{ 
		FirefoxDriver driver=new FirefoxDriver();
			driver.get("https://gmail.com");
			WebElement wb1=driver.findElement(By.id("identifierId"));
			wb1.sendKeys("seleniumoar1234");
			WebElement wb2=driver.findElement(By.xpath("//span[text()='Next']"));
			wb2.click();
			Thread.sleep(2000);
			WebElement wb3=driver.findElement(By.name("password" ));
			wb3.sendKeys("seleniumoar1234");
			WebElement wb4=driver.findElement(By.xpath("//span[text()='Next']"));
			wb4.click();
	}
}
			
			
			

