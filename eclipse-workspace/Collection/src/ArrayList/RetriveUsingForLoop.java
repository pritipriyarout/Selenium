package ArrayList;

import java.util.ArrayList;

public class RetriveUsingForLoop {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		System.out.println(a1.size());
		a1.add(new Employee());
		a1.add(new Pen());
		a1.add(new Student());
		a1.add("java");
		a1.add("java");
		a1.add(null);
		System.out.println("----------------for each----------");
		for(Object obj:a1)
		{
			System.out.println(obj);
		}

	}

}
