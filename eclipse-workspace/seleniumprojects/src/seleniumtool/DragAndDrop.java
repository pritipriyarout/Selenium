package seleniumtool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
	FirefoxDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
	WebElement scrE=driver.findElement(By.id("draggable"));
	WebElement desE=driver.findElement(By.id("droptarget"));
	Actions act=new Actions(driver);
	act.dragAndDrop(scrE, desE).perform();

	}

}
