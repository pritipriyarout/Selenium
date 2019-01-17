package seleniumtool;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardOperation {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		WebElement wb=driver.findElement(By.id("username"));
		wb.sendKeys("admin");
		Actions act=new Actions(driver);
		act.doubleClick(wb).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL,"v")).perform();
		act.sendKeys(Keys.ENTER).perform();

		
		
		
		

	}

}
