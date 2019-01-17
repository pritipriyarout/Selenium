package methodschaining;
class B
{
String mtd()
{
	String str=new String("Qspider");
	System.out.println("execute");
	return str;
}
	
}

public class Derivedobject {

	public static void main(String[] args) {
	B b1=new B();
	String str=b1.mtd();
	System.out.println(str);
	}

}
