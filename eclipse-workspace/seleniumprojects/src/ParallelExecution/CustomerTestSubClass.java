package ParallelExecution;

import org.testng.annotations.Test;

public class CustomerTestSubClass extends BaseeClass {
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
			

}
