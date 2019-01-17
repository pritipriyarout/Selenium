package seleniumtool;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureDynamic {

	public static void main(String[] args) {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://flipkart.com");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	String x="//img[contains(@src,'timer')]/following-sibling::span";
	String dynamicText=driver.findElement(By.xpath(x)).getText();
	System.out.println(dynamicText);
	

	}

}
