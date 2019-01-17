import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureAmazonFridge {

	public static void main(String[] args) {
		 WebDriver driver=new FirefoxDriver();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    driver.get("https://www.flipkart.com/");
		    //close the popp-up
		    driver.findElement(By.xpath("//button[text()='✕']")).click();
		    //search for iphone product
		    driver.findElement(By.name("q" )).sendKeys("fridge",Keys.ENTER);
String x="//div[text()='Samsung 253 L Frost Free Double Door 4 Star Refrigerator']/../../div[2]/div[1]/div[1]/div[1]";
		String price=driver.findElement(By.xpath(x)).getText();
		System.out.println(price);
		

	}

}
