package seleniumtool;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyPMOLink {

	public static void main(String[] args) {
	FirefoxDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://google.com");
	driver.findElement(By.id("lst-ib")).sendKeys("wipro jobs",Keys.ENTER);
	Actions act=new Actions(driver);
	act.contextClick(driver.findElement(By.id("vn1s0p1c0")));
	act.sendKeys("T").perform();
			
	
	

	}

}
