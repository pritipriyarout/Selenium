package methodschaining;
class Explore
{
	Element find()
	{
		System.out.println("find an element");
		Element e1=new Element();
		return e1;
	}
}
class Element
{
	void sendkeys()
	{
		System.out.println("enter data");
	}
	void click()
	{
	System.out.println("click");
	}
}
public class Test {
	

	public static void main(String[] args) {
	Explore f=new Explore();
	f.find().sendkeys();
	f.find().click();
	}
}