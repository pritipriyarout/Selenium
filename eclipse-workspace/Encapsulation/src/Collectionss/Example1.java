package Collectionss;

import java.beans.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {
    ArrayList a=new ArrayList();
   Employee emp=new Employee();
   Student std=new Student();
   a.add(emp);
   a.add("java");
   a.add(null);
   a.add(std);
   a.add("mava");
   a.add("mava");
   a.add(null);
   a.add("java");
   a.add(std);
   System.out.println(a.size());
   for(int i=0;i<=a.size()-1;i++)
   {
	   for(int j=i+1;j<=a.size()-1;j++)
	   {
		   if(a.get(i).equals(a.get(j)))
		   {
			   a.remove(j);
			   j--;
		   }
	   }
   }
  
  for(Object obj:a)
  {
	  System.out.println(obj);
  }
   
   
    
	}

}
