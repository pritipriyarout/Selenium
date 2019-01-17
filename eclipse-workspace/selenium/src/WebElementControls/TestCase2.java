package WebElementControls;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://gmail.com");
	driver.findElement(By.id("identifierId")).sendKeys("pritipriyasamal25");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("password" )).sendKeys("769004pps");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("selenium");
	driver.findElement(By.name("q")).click();
	WebElement wb=driver.findElement(By.name("q"));
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
	System.out.println(dem.getHeight());
	System.out.println(dem.getWidth());
	Point p=wb.getLocation();
	System.out.println(p.getX());
	System.out.println(p.getY());
	driver.findElement(By.xpath("//span[@class='gb_ab gbii']")).click();
	

	}

}
