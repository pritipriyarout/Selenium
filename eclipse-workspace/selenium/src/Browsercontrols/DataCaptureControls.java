package Browsercontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataCaptureControls {

	public static void main(String[] args) throws InterruptedException {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://gmail.com");
	driver.findElement(By.id("identifierId")).sendKeys("pritipriyasamal25");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("password" )).sendKeys("769004pps");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	
	

	}

}
