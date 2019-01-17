package arrayprogram;

import java.util.Scanner;

public class NoOFOccurance {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the element");
		int[] a=new int[5];
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=s.nextInt();
		}
     System.out.println("find the no of occurance of given no");
     int k=s.nextInt();
     int count=0;
     for(int j=0;j<=a.length-1;j++)
     {
    	 if(a[j]==k)
    	 {
    		 count++; 
    	 }
     }
     System.out.println("no of occurance of given no is:"+k+" "+count);
	}

}
