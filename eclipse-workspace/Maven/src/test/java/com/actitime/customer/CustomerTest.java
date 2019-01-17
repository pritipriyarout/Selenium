package com.actitime.customer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CustomerTest {
@Test
public void createCustomerTest()
{
	System.out.println("execute create customer");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://gmail.com");
	driver.close();
}
@Test
public void modifyCustomerTest()
{
	System.out.println("execute modify customer");
}
@Test
public void deleteCustomerTest()
{
	System.out.println("execute delete customer");
}
}
