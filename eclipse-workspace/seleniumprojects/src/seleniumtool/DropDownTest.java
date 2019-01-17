package seleniumtool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sanjaya/Desktop/Select.html");
		WebElement wb=driver.findElement(By.name("sel"));
	    Select sel=new Select(wb);
		boolean status=sel.isMultiple();
		if(status)
			{
			for(int i=0;i<8;i++)
			{
				sel.selectByIndex(i);
			}
			}
		else
		{
			System.out.println("its not a multiselect dropdown");
		}
	}

}
