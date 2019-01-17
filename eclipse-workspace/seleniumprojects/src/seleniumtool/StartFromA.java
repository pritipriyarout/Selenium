package seleniumtool;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StartFromA {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sanjaya/Desktop/Select.html");
		
		String expVal="a";
		
		//finding dynamic dropdown in UI
		WebElement wb=driver.findElement(By.name("sel"));
		//create a object to select class
		Select sel=new Select(wb);
		//capture all the value from the dropdown
	   List<WebElement> lst=sel.getOptions();
	   //display the option
	   System.out.println(lst.size());
	   //using loop itrator the loop &check for the expected option
	   for(WebElement wbOption:lst)
	   {
		   String actVal=wbOption.getText();
		   //Verify expvalis avil or not
		   if (actVal.startsWith(expVal))
		   {
	       sel.selectByVisibleText(actVal);
		   }
	   }
	}
}
	    
	  



