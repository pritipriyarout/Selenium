package seleniumtool;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExpectedMSGinWebtable {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://gmail.com");
		//login
		driver.findElement(By.id("identifierId")).sendKeys("pritipriyasamal25");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.name("password")).sendKeys("769004pps");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		String x="//table[@class='F cf zt']/tbody/tr[*]/td[6]/*";
		List<WebElement> lst=driver.findElements(By.xpath(x));
		String expMsg="Job | Immediate opening for customer support";
		for(int i=0;i<lst.size();i++)
		{
			String subject=lst.get(i).getText();
			if(expMsg.equals(subject))
			{
				lst.get(i).click();
				break;
			}
		}
		System.out.println(expMsg);
	}
}
				
				
				
				
				
				
				
				

