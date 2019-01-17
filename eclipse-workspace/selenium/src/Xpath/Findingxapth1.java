package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Findingxapth1 {

	public static void main(String[] args) {
	
			FirefoxDriver driver=new FirefoxDriver();
			driver.get("https://flipkart.com");
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			driver.findElement(By.name("q")).sendKeys("book",Keys.ENTER);
           String x="//a[text()='Life is What You Make it']/following-sibling::a/div/div[1]";
           String price=driver.findElement(By.xpath(x)).getText();
			System.out.println(price);

	}

}
