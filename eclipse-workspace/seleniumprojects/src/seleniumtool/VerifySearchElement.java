package seleniumtool;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifySearchElement {

	public static void main(String[] args) throws Throwable{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("pritipriyasamal25");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("769004pps");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gbqfb" )).sendKeys("selenium");
		driver.findElement(By.id("gbqfq")).click();
		WebElement wb=driver.findElement(By.id("gbqfq"));
		Thread.sleep(2000);
		String actVal=wb.getAttribute("value");
		System.out.println(actVal);
		if(actVal.equals("selenium"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		Dimension dem=wb.getSize();
		System.out.println("get the height of the element=="+dem.getHeight());
		System.out.println("get the width of the element=="+dem.getWidth());
		
		//location
		Point p=wb.getLocation();
		System.out.println("get the x-co-ordinate=="+p.getX());
		System.out.println("get the y-co-ordinate=="+p.getY());
		//identify
		driver.findElement(By.xpath("//span[@class='gb_db gbii']"));
		Thread.sleep(1000);
		driver.findElement(By.id("gb_71"));
		driver.close();
		
		
		}
		
		

	}


