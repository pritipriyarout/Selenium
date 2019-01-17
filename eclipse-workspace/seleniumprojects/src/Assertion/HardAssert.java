package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import testNG.BaseClass;

public class HardAssert extends BaseClass {
@Test
public void verifyHomePage()
{
	String ExpTitle="actiTime-Task";
	String ActTitle=driver.getTitle();
	Assert.assertEquals(ActTitle, ExpTitle);
}
		@Test
		public void verifyHomePageLogo()
		{
			boolean imgstat=driver.findElement(By.xpath("//img[contains(@src,'default-logo.png')]")).isDisplayed();
		Assert.assertTrue(imgstat);
	}
}

