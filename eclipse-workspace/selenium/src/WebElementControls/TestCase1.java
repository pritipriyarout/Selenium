package WebElementControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		String expTitle="Gmail";
		String expmsg="Couldn't find your Google Account";
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		String actTitle=driver.getTitle();
		if(actTitle.equals(expTitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
	
		}
		driver.findElement(By.id("identifierId")).sendKeys("hh");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		WebElement wb=driver.findElement(By.xpath("//div[@class='dEOOab RxsGPe'][1]"));
		String actmsg=wb.getText();
		if(actmsg.equals(actmsg))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
			String color=wb.getCssValue("color");
			System.out.println(color);
					driver.close();
	}
}

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
		
		

	


