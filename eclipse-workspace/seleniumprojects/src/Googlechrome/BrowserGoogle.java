package Googlechrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserGoogle {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "‪C:\\seleniumgooglechrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("nav-your-amazon"));

	}

}