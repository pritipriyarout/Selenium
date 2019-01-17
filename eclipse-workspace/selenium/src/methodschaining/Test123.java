package methodschaining;
class C
{
	D mtd1()
	{
	System.out.println("mtd1");
	D d1=new D();
	return d1;
}
C mtd2()
{
	System.out.println("mtd2");
	C c2=new C();
	return c2;
}
C mtd3()
{
	System.out.println("mtd3");
	C c3=new C();
	return c3;
}
}
class D
{
	void test()
	{
		System.out.println("test");
	}
	
}
class Test123 {
	

	public static void main(String[] args) {
		C c1=new C();
		c1.mtd1().test();
		c1.mtd2().mtd3();
		c1.mtd2().mtd1().test();
		
		

	}

}
