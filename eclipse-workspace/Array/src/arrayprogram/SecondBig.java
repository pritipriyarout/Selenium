package arrayprogram;

public class SecondBig {

	public static void main(String[] args)
	{
		int[] arr= {90,78,356,98,8};
		int big=0;int sbig=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(big<arr[i])
			{
				sbig=big;
				big=arr[i];
			}
			else if(sbig<arr[i])
			{
				sbig=arr[i];
			}
		}
				System.out.println(sbig);
			}
		}
	


