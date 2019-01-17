package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Program3 {

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
	Iterator it=a1.iterator();
	while(it.hasNext())
	{
		Object obj=it.next();
		System.out.println(obj);
	}

}
}
