package Filehandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUUpload {

	
		public static void uploadFile(String path) throws InterruptedException, AWTException
		{
			StringSelection s= new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
			Thread.sleep(3000);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		public static void main(String[] args) throws InterruptedException, AWTException {
			String filepath="‪C:\\Users\\sanjaya\\Downloads\\Pritipriya Samal.doc";
			WebDriver d=new FirefoxDriver();
			d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			d.get("https://naukri.com");
			d.findElement(By.xpath("//div[text()='Login'][1]")).click();
			d.findElement(By.id("eLoginNew")).sendKeys("pritipriyasamal25@gmail.com");
			d.findElement(By.name("PASSWORD")).sendKeys("769004pps");
			d.findElement(By.xpath("//button[text()='Login']")).click();
		    d.findElement(By.xpath("//a[text()='UPDATE PROFILE']")).click();
		    Thread.sleep(2000);
			//Actions act=new Actions(d);
			//act.moveToElement(wb).perform();
			//d.findElement(By.xpath("//a[text()='Edit Profile']")).click();
		    d.findElement(By.id("attachCV")).click();
		    uploadFile(filepath);
		


	}

}
