package com.actitime.customertest;

public class CustomerTest {
	@Test
	public void cteateCutomerTest()
	{
		System.out.println("execute create customer");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://gmail.com");
	}
@Test
public void modifycustomerTest()
{
	System.out.println("execute modify customer");
}
@Test
public void deleteCusatomerTest()
{
	System.out.println("execute delete customer");
}
}
