package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerTest1 {

@BeforeMethod
public void configBM()
{
	System.out.println("login");
}
@Test
public void createCustomerTest()
{
	System.out.println("createCustomerTest");
}
@Test
public void modifyingCustomerTest()
{
	System.out.println("modifyingCustomerTest");
}
@Test
public void deleteCusomerTest()
{
	System.out.println("deleteCusomerTest");

}
		
@AfterMethod
public void congigAM()
{
	System.out.println("logout");
	
}
	

}
