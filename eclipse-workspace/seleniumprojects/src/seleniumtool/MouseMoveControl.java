package seleniumtool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoveControl {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
WebElement wb=driver.findElement(By.xpath("//span[text()='Shop by']"));
		Actions act=new Actions(driver);
		act.moveToElement(wb);
		act.perform();
		WebElement wb1=driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		act.moveToElement(wb1).perform();
		driver.findElement(By.xpath("//span[text()='Tablets']")).click();
		
		
		
		
		
		

	}

}
