package arrayprogram;

import java.util.Scanner;

public class CreateandInsertElementDyanamically {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		int[] arr=new int[s.nextInt()];
		//print array
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		//add elements
		System.out.println("enter the element");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=s.nextInt();
		}
		//print array
				for(int i=0;i<=arr.length-1;i++)
				{
					System.out.println(arr[i]);
				}
	}

}
