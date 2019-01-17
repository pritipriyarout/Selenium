package Googlechrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeBrowser {

	public static void main(String[] args) {
		System.setProperty(" webdriver.ie.driver", "C:\\IEbrowser\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("nav-your-amazon"));
		
		

	}

}
