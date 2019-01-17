package ActionandSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass1 {

	public static void main(String[] args) {
FirefoxDriver driver=new FirefoxDriver();
driver.get("https://facebook.com");
WebElement dwb=driver.findElement(By.id("day"));
Select sel2=new Select(dwb);
sel2.selectByVisibleText("25");
WebElement mwb=driver.findElement(By.id("month"));
Select sel=new Select(mwb);
sel.selectByVisibleText("dec");
WebElement ywb=driver.findElement(By.id("year"));
Select sel1=new Select(ywb);
sel1.selectByVisibleText("1990");


	}

}
