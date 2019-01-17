package methodschaining;

 class A {
	int mtd(int i)
	{
		System.out.println("execute");
		return i+10;
	}
}

	class Example1
	{
		
	public static void main(String[] args) {
		A a1=new A();
		int j=a1.mtd(10);
		System.out.println(j);
		
	}

}
