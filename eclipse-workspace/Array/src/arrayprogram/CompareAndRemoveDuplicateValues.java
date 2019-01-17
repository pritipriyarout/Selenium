package arrayprogram;


import java.util.Arrays;

public class CompareAndRemoveDuplicateValues {

	public static void main(String[] args) {
		int[] a={10,20,30,40,50,10,50,20,10};
		Arrays.sort(a);
		for(int i=0;i<=a.length-1;i++)
		{
			int count=0;
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(a[i]);
			}
		}

	}

}
