import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sanjaya/Desktop/htmlcodes/pritipage.html");
		driver.findElement(By.xpath("//html/body/input[1]")).sendKeys("priti");
		driver.findElement(By.xpath("//html/body/input[2]")).sendKeys("priti");
		driver.findElement(By.xpath("//html/body/input[3]")).click();
		driver.findElement(By.xpath("//html/body/input[4]")).click();
		
		
		

	}

}
