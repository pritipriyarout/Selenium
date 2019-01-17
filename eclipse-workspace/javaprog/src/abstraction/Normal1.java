package abstraction;
abstract class A
{
	abstract public void wish();
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
public class Normal1 
{
	public static void main(String []args)
	{
	B b1=new B();
	b1.wish();
	b1.run();
	}

}
