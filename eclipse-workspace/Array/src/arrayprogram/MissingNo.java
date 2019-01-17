package arrayprogram;

public class MissingNo {

	public static void main(String[] args) {
	int[] a= {10,50,60,80};
	for(int i=1;i<=100;i++)
	{
		int count=0;
		for(int k:a) 
		{
			if(i==k)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println(i);
		}
	}
	

		}
	

	}


