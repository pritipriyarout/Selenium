package methodschaining;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Price {

	public static void main(String[] args) {
		int big=0;
		System.setProperty("webdriver.chrome.driver","./resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
List<WebElement>lst=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[*]/td[4]"));
System.out.println(lst.size());
for(int i=0;i<=lst.size();i++)
{
	String s=lst.get(i).getText();
	System.out.println(s);
}
ArrayList<integer> ar=new ArrayList<integer>();
System.out.println(ar.size());
if(int big<)


	

	}

}
