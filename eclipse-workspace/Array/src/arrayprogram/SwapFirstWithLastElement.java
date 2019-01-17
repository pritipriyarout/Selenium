package arrayprogram;

public class SwapFirstWithLastElement {

	public static void main(String[] args) {
		int[] a= {10,50,60,90,110,100};
		int temp=0;
		temp=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=temp;
		for(int k:a)
		{
			System.out.println(k);
		}
	

	}

}
