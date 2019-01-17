//index based opertion on an arrayList
package ArrayList;

import java.util.ArrayList;

public class Program2 {

	public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	System.out.println(a1.size());
	Employee emp=new Employee();
	a1.add(emp);
	a1.add(emp);
	a1.add(new Employee());
	a1.add(new Pen());
	a1.add(new Student());
	a1.add(null);
	System.out.println(a1.size());
	System.out.println("element at index 2 is"+a1.get(2));
	for(int i=0;i<a1.size();i++)
	{
		System.out.println(a1.get(i));
	}
	System.out.println("---------------------");
	a1.add(3,"java");
	Object s=a1.get(3);
	System.out.println(s);
	Object obj=a1.set(3, "mava");
	System.out.println("value returned by set"+obj);
	Object x=a1.remove(2);
	System.out.println(x);
	for(int i=0;i<a1.size();i++)
	{
		System.out.println(a1.get(i));
	}
	
	
	}
}
	
	



	


