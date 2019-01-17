package arrayprogram;

public class SmallestNumber {

	public static void main(String[] args) {
		int[] arr= {90,78,356,98,8};
		int small=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<small)
			{
				small=arr[i];
			}
		}
				System.out.println(small);
			}

	}


