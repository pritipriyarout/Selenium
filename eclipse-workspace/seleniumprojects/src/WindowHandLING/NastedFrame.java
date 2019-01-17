package WindowHandLING;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NastedFrame {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://yahoo.com");		
		//switch to grand parents
		driver.switchTo().frame("my-adsLREC2-iframe");
		//switch to parent frame
		driver.switchTo().frame("aswift_0");
		//switch to child frame
		driver.switchTo().frame("google_ads_frame1");
		//click on element
		driver.findElement(By.xpath("//img[contains(@src,'Other_Market')]")).click();
		//pass driver back to main window
		driver.switchTo().defaultContent();
		//get all windows id
		Set<String> set=driver.getWindowHandles();
		Iterator< String> it=set.iterator();
		String pid=it.next();
		String cid=it.next();
		//pass control to child window
		driver.switchTo().window(cid);
		
		

	}

}
