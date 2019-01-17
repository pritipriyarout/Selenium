package seleniumtool;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NvigationControl {

	public static void main(String[] args) throws Throwable{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://gmail.com");
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().deleteAllCookies();
			

	}

}
