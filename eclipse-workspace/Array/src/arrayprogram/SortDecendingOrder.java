package arrayprogram;

import java.util.Scanner;

public class SortDecendingOrder {

	public static void main(String[] args) {
		int[] ch=new int[5];
		int temp;
		Scanner s=new Scanner(System.in);
		System.out.println("enter elements");
		for(int i=0;i<5;i++)
		{
			int a=s.nextInt();
			ch[i]=a;
		}
		for(int i=0;i<=ch.length-1;i++)
		{
			for(int j=i+1;j<=ch.length-1;j++)
			{
				if(ch[i]<ch[j])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
       for(int i=0;i<=ch.length-1;i++)
       {
    	   System.out.println(ch[i]+" ");
       }
	}

}
