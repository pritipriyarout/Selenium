package seleniumtool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class VerifyFacebookLoginPage {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		WebElement imgwb=driver.findElement(By.xpath(" //img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/yc/r/GwFs3_KxNjS.png']"));
		boolean imgstat=imgwb.isDisplayed();
		if(imgstat)
		{
			System.out.println("image is displayed==pass");
		}
		else
		{
			System.out.println("image is not displayed==fail");
		}
	WebElement radiowbm=driver.findElement(By.id("u_0_a"));
	WebElement radiowbf=driver.findElement(By.id("u_0_9"));
	boolean radiostatm=radiowbm.isSelected();
	boolean radiostatf=radiowbf.isSelected();
	if(radiostatm && radiostatf)
	{
		System.out.println("radio is selected==fail");
	}
	else
	{
		System.out.println("radio is not selected==pass");
	}
	String actVal=driver.findElement(By.id("u_0_j")).getAttribute( "aria-label");
	if(actVal.equals("First name"))
	{
		System.out.println("first name is verified==pass");
	}
	else
	{
		System.out.println("first name is not verified==fail");
	}
	driver.close();
	}
}
	
	
	
