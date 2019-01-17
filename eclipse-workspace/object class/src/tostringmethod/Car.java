package tostringmethod;

public class Car {
	String brandName;
	String color;
	int model;
	int price;
	
		public Car(String brandName,String color,int model,int price)
		{
			this.brandName=brandName;
			this.color=color;
			this.model=model;
			this.price=price;
		}
		public boolean equals(Object o1)
		{
			Car c2=(Car)o1;
			return this.brandName==c2.brandName&&this.color==c2.color&&this.model==c2.model&&this.price==c2.price;
		}

	public static void main(String[] args) {
		Car c1=new Car("audi","red",20,5000000);
		Car c2=new Car("audi","red",20,5000000);
		System.out.println(c1.equals(c2));
	}
}
		

