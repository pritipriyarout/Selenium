package seleniumtool;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathprogram2 {

	public static void main(String[] args) {
			FirefoxDriver driver=new FirefoxDriver();
			driver.get("file:///C:/Users/sanjaya/Desktop/xpath%20page.html");
			driver.findElement(By.xpath("//div[@class='android']/input[@value='add to cart']"));
			driver.findElement(By.xpath("//div[@class='android']/input[@value='cancel']"));
			driver.findElement(By.xpath("//div[@class='iphone']/input[@value='add to cart']"));
			driver.findElement(By.xpath("//div[@class='iphone']/input[@value='cancel']"));

			

	}

}
