package ActionandSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass1 {

	public static void main(String[] args) {
FirefoxDriver driver=new FirefoxDriver();
driver.get("https://amazon.com");
WebElement wb=driver.findElement(By.xpath("//span[text()='Departments']"));
Actions act=new Actions(driver);
act.moveToElement(wb);
act.perform();

	}

}
