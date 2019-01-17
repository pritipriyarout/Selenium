package WindowHandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTab {

	public static void main(String[] args) throws InterruptedException {
	FirefoxDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://flipkart.com");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("redminote5",Keys.ENTER);
	driver.findElement(By.xpath("//div[text()='Redmi Note 5 (Black, 32 GB)']")).click();
	Set<String> set=driver.getWindowHandles();
	System.out.println(set.size());
	Iterator<String> it=set.iterator();
	String parentsessionaaID=it.next();
	String childsessionID=it.next();
	driver.switchTo().window(childsessionID);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
	driver.close();
	

	
	
	}

}
