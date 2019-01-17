package arrayprogram;

public class Sorting {

	public static void main(String[] args) {
	 int[] arr={1,200,15,5};
	 System.out.println("array before sorting");
	printArray(arr);
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 for(int j=i+1;j<=arr.length-1;j++)
		 {
			 if(arr[i]>arr[j])
			 {
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
		 }
		 
	 }
		System.out.println("after sorting");
	printArray(arr);
	}
	public static void printArray(int[] arr) {
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
		
	

	


