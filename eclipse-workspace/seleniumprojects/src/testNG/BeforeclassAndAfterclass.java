package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeclassAndAfterclass {
@BeforeClass
public void configBC()
{
	System.out.println("--------------launch browser-------------------");
}

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
	@AfterClass
	public void configAC()
	{
		System.out.println("---------close browser--------");
	}

}


