package hcf;

public class Hcf
{
	public static void main(String[] args)
	{
		
			int a=5;
	int b=10;

	while(b>0)
	{
		int temp=b;
		b=a%b;
		a=temp;
	}
	int k=a;
	System.out.println(k);
	}

	}



