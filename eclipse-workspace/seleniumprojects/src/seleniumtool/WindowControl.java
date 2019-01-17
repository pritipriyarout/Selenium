package seleniumtool;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowControl {

	public static void main(String[] args) {
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		Dimension dem=new Dimension(100,200);
		driver.manage().window().setSize(dem);
		driver.close();
		
		

	}

}
