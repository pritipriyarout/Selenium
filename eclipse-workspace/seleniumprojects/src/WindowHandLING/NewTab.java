package WindowHandLING;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTab {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone x",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Apple iPhone X (Space Gray, 64 GB)']")).click();
		Thread.sleep(2000);
		Set<String> set=driver.getWindowHandles();
		
		System.out.println(set.size());
		
		Iterator<String> it=set.iterator();
		
		String parentsessionID=it.next();
		String childsessionID=it.next();
		
		driver.switchTo().window(childsessionID);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
		
		driver.switchTo().window(parentsessionID);
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("nokia",Keys.ENTER);
		driver.quit();
		
		
		
		

	}

}
