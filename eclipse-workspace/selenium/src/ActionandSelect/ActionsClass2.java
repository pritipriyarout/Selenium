package ActionandSelect;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass2 {

	public static void main(String[] args) {
FirefoxDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://google.com");
driver.findElement(By. name("q")).sendKeys("wiprojobs",Keys.ENTER);
Actions act=new Actions(driver);
act.contextClick(driver.findElement(By.xpath("//div[text()='Wipro - Presales Manager - Automation & Digital Transformation - ...']")));
act.sendKeys("T").perform();


	}

}
