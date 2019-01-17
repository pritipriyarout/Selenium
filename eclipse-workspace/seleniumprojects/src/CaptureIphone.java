import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureIphone {

	public static void main(String[] args) {
		 WebDriver driver=new FirefoxDriver();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    driver.get("https://www.flipkart.com/");
		    //close the popp-up
		    driver.findElement(By.xpath("//button[text()='✕']")).click();
		    //search for the iphone x product
		    driver.findElement(By.name("q" )).sendKeys("iphone x",Keys.ENTER);
		    //capture the price 
		    String x="//div[text()='Apple iPhone X (Silver, 256 GB)']/../../div[2]/div[1]/div/div";
		   String price=driver.findElement(By.xpath(x)).getText();
		   System.out.println(price);

	}
}