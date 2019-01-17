package Inheritance;
class Aa
{
	public void run()
	{
		System.out.println("in run");
	}
}	
	
class Ba extends Aa
{
	public void wish()
	{
		System.out.println("in wish");
	}
		
	}
class Ca extends Ba
{
	public void fly()
	{
		System.out.println("in fly");
		
		}
		
	}
public class Multilevel {
	

	public static void main(String[] args) {
		Aa a1=new Aa();
		a1.run();
		Ba b1=new Ba();
		b1.run();
		b1.wish();
		Ca c1=new Ca();
		c1.run();
		c1.wish();
		c1.fly();

	}

}
