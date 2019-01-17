package ArrayList;

import java.util.HashMap;
import java.util.Set;

import javax.swing.SortingFocusTraversalPolicy;

public class Employee {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(2, "JAVA");
		map.put(1, "Qspider");
		map.put("lava",1);
		Set keys=map.keySet();
		for(Object o:keys)
		{
		System.out.println(o);
		}

	}

}
