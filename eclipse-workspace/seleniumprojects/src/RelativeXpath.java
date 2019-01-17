import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sanjaya/Desktop/pritipage.html");
		driver.findElement(By.xpath("//input[@name='usrename']")).sendKeys("priti");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("priti");
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		
	}

}
