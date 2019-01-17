package seleniumtool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DrioDownTest {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		//identify month dropdown
		 WebElement mwb=driver.findElement(By.id("month"));
		// create a object"SECECT"class &pass dropdown
		 Select sel=new Select(mwb);
		 //select the option
		 sel.selectByVisibleText("Dec");
		 //identify your dropdown
		 WebElement ywb=driver.findElement(By.id("year" ));
		 Select sel1=new Select(ywb);
		 sel1.selectByVisibleText("1991");
	

	}

}
