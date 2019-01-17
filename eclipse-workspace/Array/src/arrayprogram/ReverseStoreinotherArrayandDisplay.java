package arrayprogram;

public class ReverseStoreinotherArrayandDisplay {

	public static void main(String[] args) {
		int[] a= {5,2,10};
		int[] b=new int[a.length];
		int k=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[k++]=a[i];
		}
		for(int j:b)
		{
			System.out.println(j);
		}

	}

}
