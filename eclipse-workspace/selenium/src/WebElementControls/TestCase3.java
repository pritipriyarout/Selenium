package WebElementControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase3 {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
WebElement wb=driver.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/yc/r/GwFs3_KxNjS.png']"));
		boolean imgstat=wb.isDisplayed();
		if(imgstat)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		}

	}

}
