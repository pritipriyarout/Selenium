package Browsercontrols;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DataCaptureControls1 {

	public static void main(String[] args) {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://facebook.com");
	String s1=driver.getTitle();
	System.out.println(s1);
	String s2=driver.getCurrentUrl();
	System.out.println(s2);
	String s3=driver.getPageSource();
	System.out.println(s3);


	}

}
