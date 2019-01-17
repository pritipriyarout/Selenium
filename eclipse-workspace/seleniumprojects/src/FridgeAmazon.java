import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FridgeAmazon {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.amazon.in/");
	    //search for the led tv product
	    driver.findElement(By.name("field-keywords")).sendKeys("refrigirator",Keys.ENTER);
	    String x="//h2[text()='Haier 170 L 3 Star Direct-Cool Single Door Refrigerator (HRD-1703SR-R/HRD-1703SR-E, Burgundy Red)']/../../../../div[5]/div[1]/a/span";
	   String price= driver.findElement(By.xpath(x)).getText();
	    System.out.println(price);

}


	}


