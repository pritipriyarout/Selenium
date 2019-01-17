package Assertion;

import org.testng.annotations.Test;


public class SoftAssert {
@Test
public void createCustomerTest()
{
	System.out.println("step1");
	System.out.println("step2");
	 SoftAssert s=new SoftAssert();
	s.assertEuals("A","B");
	System.out.println("step3");
	s.assertEquals("x","y");
	s.assertAll();
}@


