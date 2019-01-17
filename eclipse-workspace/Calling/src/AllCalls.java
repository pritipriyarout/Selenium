
 class AllCalls {
	 static String A="Play with it";
	 int k=10;
	 public static void display()
	 {
		 
		 System.out.println("in Non static variable");
		 System.out.println('A');
		 AllCalls c2=new AllCalls();
		 System.out.println(c2.k);
	 }
public void run()
{
	display();
	System.out.println("Non static to static");
	fly();
}
public void fly()
{
	System.out.println("Static to static");
}
public static void main(String[] args)
{
AllCalls c1=new AllCalls();
c1.run();

}

}