package com.actitime.genericlib;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testNG.BaseClass;


@Listeners(com.actitime.genericlib.SampleListner.class)
public class CustomerTest123 extends BaseClass
{
	@Test
	public void createCustomerTest()
	{
		driver.findElement(By.xpath("//span[text()='task']")).click();
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
}
}
