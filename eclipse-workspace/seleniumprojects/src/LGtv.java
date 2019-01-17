import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LGtv {

	public static void main(String[] args) {
		 WebDriver driver=new FirefoxDriver();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    driver.get("https://www.amazon.in/");
		    //search for the led tv product
		    driver.findElement(By.name("field-keywords")).sendKeys("led tv",Keys.ENTER);
		    //capture the price 
		    String x="//h2[@data-attribute='Surya Full HD LED TV 32 inch with Samsung A+ Display Panel and Bass Tube Speakers for Extra Party Sound']/../../../../div[2]/div[1]/div[1]/a/span/span";
		   String price=driver.findElement(By.xpath(x)).getText();
		   System.out.println(price);

}

	}


