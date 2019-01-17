//adding both homogenous and hetrogenenous data,adding duplicate elements,adding null value and
//preserving order of insertion

package ArrayList;

import java.util.ArrayList;

public class Program1 {

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
		for(Object obj:a1)
		{
			System.out.println(obj);
		}
		
		
	}
}