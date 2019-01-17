package arrayprogram;

import java.util.Scanner;
public class CreateAndaddElements {
		static Scanner sc=new Scanner(System.in);
		public static void main(String[] args)
		{
			System.out.println("enter size of an array1");
			int [] arr1=new int[sc.nextInt()];
			printArray(arr1);
			arr1=addElements(arr1);
			printArray(arr1);
			System.out.println("---------");
			System.out.println("enter the size of array2");
			int [] arr2=new int[sc.nextInt()];
			arr2=addElements(arr2);
			printArray(arr2);
	}
		public static void printArray(int[] arr) {
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.println(arr[i]);
			}
		}
		public static int[] addElements(int[] arr) {
			System.out.println("enter the elements");
			for(int i=0;i<=arr.length-1;i++)
			{
				arr[i]=sc.nextInt();
				
			}
		
			return arr;
		}
		
}
