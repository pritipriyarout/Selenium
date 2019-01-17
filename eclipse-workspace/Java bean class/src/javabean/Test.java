package javabean;

public class Test {

	public static void main(String[] args) {
		Account a1=new Account();
		System.out.println(a1.getAccountNumber());
		a1.setpassward("priti123");
		a1.setAddress("Marathalli");
		System.out.println(a1.getAddress());

	}

}
