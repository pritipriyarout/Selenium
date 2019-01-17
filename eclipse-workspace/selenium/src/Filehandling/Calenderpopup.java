package Filehandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calenderpopup {

	public static void main(String[] args) {
	String year="2019";
	String month="2";
	String date="15";
	//WebDriver d=new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver","./resource/chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	d.get("https://cleartrip.com");
	d.findElement(By.xpath("//i[text()='Cal'][1]")).click();
	while(true)
	{
			try
			{
	d.findElement(By.xpath("//td[@data-month='"+month+"'"+"and @data-year='"+year+"']/a[text()='"+date+"']")).click();
	break;
			}
			catch(Exception e)
			{
				d.findElement(By.xpath("//a[@title='Next'][2]")).click();
			}
		}
	}
}
	

	

