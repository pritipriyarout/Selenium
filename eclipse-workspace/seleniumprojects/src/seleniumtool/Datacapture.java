package seleniumtool;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Datacapture {

	public static void main(String[] args) {
		 
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://facebook.com");
		String actTitle=driver.getTitle();
		
		System.out.println(actTitle);
		
		String actURL=driver.getCurrentUrl();
		System.out.println(actURL);
		
		String acthtmlcode=driver.getPageSource();
		System.out.println(acthtmlcode);
		driver.close();

	}

}
