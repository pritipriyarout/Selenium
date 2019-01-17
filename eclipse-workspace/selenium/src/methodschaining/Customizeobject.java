package methodschaining;
class Firefox
{
	Webelement find()
	{
		System.out.println("element");
		Webelement w1=new Webelement();
		return w1;
	}
}
class Webelement
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
public class Customizeobject {
	

	public static void main(String[] args) {
	Firefox f=new Firefox();
	Webelement w1=f.find();
	w1.sendkeys();
	w1.click();
	}
}



