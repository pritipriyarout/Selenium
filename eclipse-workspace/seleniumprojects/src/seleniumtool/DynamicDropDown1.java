package seleniumtool;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown1 {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sanjaya/Desktop/Select.html");
		String expVal="testing";
		//finding dynamic dropdown in UI
		WebElement wb=driver.findElement(By.name("sel"));
		//create a object to select class
		Select sel=new Select(wb);
		//capture all the value from the dropdown
	   List<WebElement> lst=sel.getOptions();
	 for(WebElement wboption:lst)
	 {
		 String actVal=wboption.getText();
		 System.out.println(actVal);
		if(actVal.contains(expVal))
		{
			sel.selectByVisibleText(actVal);
		 }
	 }

	}

}
