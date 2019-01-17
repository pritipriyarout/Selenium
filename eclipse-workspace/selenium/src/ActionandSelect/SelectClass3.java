package ActionandSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass3 {

	public static void main(String[] args) {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/sanjaya/Desktop/htmlcodes/Select.html");
	String expval="JAVA";
	boolean flag=false;
	WebElement wb=driver.findElement(By.name("sel"));
	Select sel=new Select(wb);
	List<WebElement> lst=sel.getOptions();
	System.out.println(lst.size());
	for(WebElement wboption:lst)
	{
		String actval=wboption.getText();
		if(expval.equals(actval))
		{
			sel.selectByVisibleText(expval);
		
		flag=true;
		break;
	}
	}
		
	}
	

	}


