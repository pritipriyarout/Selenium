import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureDynamicElement {

	public static void main(String[] args) {
    WebDriver driver=new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("https://www.flipkart.com/");
    //close the popp-up
    driver.findElement(By.xpath("//button[text()='✕']")).click();
    //search for iphone product
    driver.findElement(By.name("q" )).sendKeys("iphone",Keys.ENTER);
    //capture the text from UI
    String x="//span[contains(text(),'Showing')]";
    String data=driver.findElement(By.xpath(x)).getText();
    System.out.println(data);
    String[]arr=data.split(" ");
    System.out.println(arr[5]);

	}

}
