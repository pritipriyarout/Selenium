package Filehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownload {

	public static void main(String[] args) {
	FirefoxProfile p=new FirefoxProfile();
	p.setPreference("browser.download.folderlist", 0);
	p.setPreference("browser.helperApps.neverAsk.saveToDisk", "Application/zip");
	WebDriver d=new FirefoxDriver(p);
	d.get("https://maven.apache.org/download.zip");
	d.findElement(By.linkText("apache-maven-3.6.0-bin.zip")).click();
			
			
			

	}

}
