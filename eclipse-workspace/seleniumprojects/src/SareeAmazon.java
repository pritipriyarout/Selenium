import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SareeAmazon {

	public static void main(String[] args) {
		 WebDriver driver=new FirefoxDriver();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    driver.get("https://www.amazon.in/");
		    //search for the led tv product
		    driver.findElement(By.name("field-keywords")).sendKeys("saree",Keys.ENTER);
		    String x="//h2[text()='Triveni Faux Georgette Saree With Blouse Piece(ZTSPOO13384_Beige_Free Size)']/../../../div[2]/a/span";
		   String price= driver.findElement(By.xpath(x)).getText();
		    System.out.println(price);

	}

}
