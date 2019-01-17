package com.actitime.genericlib;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.actitime.genericlib.SampleaListner.class)
public class CustomerTest extends BaseClass {
	
	@Test 
	public void modifycustomerTest()
	{
		driver.findElement(By.xpath("//span[text()='Tasks']")).click();
		System.out.println("modifycustomerTest");
	}
	
	}


