package Xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements1 {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://yahoo.com");
		String x="//span[text()='Investment Trends']/../../div/ul/li";
		List< WebElement>lst=driver.findElements(By.xpath("x"));
		//System.out.println(lst.size());
		for(WebElement wb:lst)
		{
			System.out.println(wb.getText());
		}
		
	}

}
