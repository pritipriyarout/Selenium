package Filehandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {
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
		d.get("https://gmail.com");
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.findElement(By.id("identifierId")).sendKeys("pritipriyasamal25");
		Actions act=new Actions(d);
		act.sendKeys(Keys.ENTER).perform();
		d.findElement(By.name("password")).sendKeys("769004pps");
		act.sendKeys(Keys.ENTER).perform();
		d.findElement(By.xpath("//div[text()='Compose']")).click();
		d.findElement(By.xpath("//div[@aria-label='Attach files']/div/div/div")).click();
		uploadFile(filepath);
		


	}

}
