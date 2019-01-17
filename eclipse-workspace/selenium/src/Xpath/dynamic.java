package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dynamic {
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
	    String x=driver.findElement(By.xpath("//span[contains(text(),'Showing')]")).getText();
		//System.out.println(x);
		String[] arr=x.split(" ");
		//System.out.println(arr[5]);
	    int i=Integer.parseInt(arr[5]);
	    System.out.println(i);
		
	}
}

	