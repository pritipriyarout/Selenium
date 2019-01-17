package Inheritance;
class Ass
{
	int i=10;
}
class Bss extends Ass
{
	int j=20;
}
class Css extends Ass
{
	int k=30;
}
 class Hierarchical {
	public static void main(String[] args) {
Ass a1=new Ass();
System.out.println(a1.i);
Bss b1=new Bss();
System.out.println(b1.i);
System.out.println(b1.j);
Css c1=new Css();
System.out.println(c1.i);
System.out.println(c1.k);



	

	}

}
