package WindowHandLING;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameWindow {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");

		//pass driver control to frame 2
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		//pass driver back to main window
		driver.switchTo().defaultContent();
		//to frame 3
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Actions")).click();
	}

}
