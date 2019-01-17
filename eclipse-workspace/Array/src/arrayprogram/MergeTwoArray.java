package arrayprogram;

public class MergeTwoArray {

	public static void main(String[] args) {
		int[] a= {10,5,8,80};
		int[] b= {5,20,40,50,6};
		int[] c= new int[a.length+b.length];
		for(int i=0;i<=a.length-1;i++)
		{
			c[i]=a[i];
		}
		for(int j=0;j<=b.length-1;j++)
		{
		c[a.length+j]=b[j];
		}
		System.out.println("elements in array a");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
			//System.out.println();
		}
			System.out.println("elements in array b");
			for(int j=0;j<=b.length-1;j++)
			{
				System.out.println(b[j]);
				//System.out.println();
			}
			System.out.println("elements in array c after merge");
			for(int i=0;i<=c.length-1;i++)
			{
				System.out.print(c[i]+" ");
			
						
			
		}
		

	}

}
