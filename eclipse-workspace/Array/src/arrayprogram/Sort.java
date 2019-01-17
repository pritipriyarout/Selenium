package arrayprogram;

public class Sort {

	public static void main(String[] args) {
		int[] a= {10,20,65,5};
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=i+1;j<=a.length-1;j++)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		System.out.println(a[i]);
	}

	}

}
