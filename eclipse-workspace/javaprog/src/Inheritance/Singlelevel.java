package Inheritance;
class A
{
	public void run()
	{
		System.out.println("in run");
	}
	
}
class B extends A
{
	public void wish()
	{
		System.out.println("in wish");
	}

}
 class Singlelevel {
	public static void main(String[] args)
	{
	A a1=new A();
	a1.run();
	B b1=new B();
	b1.run();
	b1.wish();

}
}
