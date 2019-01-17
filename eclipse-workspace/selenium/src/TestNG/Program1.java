package TestNG;

import org.testng.annotations.Test;

public class Program1 {
@Test (priority=3)
public void createcustomerTest()
{
	System.out.println("execute createcustomerTest");
}
@Test  (invocationCount=5)
public void modifycustomerTest()
{
	System.out.println("modifycustomerTest");
}
@Test  (priority=1)
public void deletecustomerTest()
{
	System.out.println("deletecustomerTest");
}
}
