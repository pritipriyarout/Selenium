package arrayprogram;

public class SecondSmallest {

	public static void main(String[] args) {
		int[]a= {10,20,30,40,50};
		int small1=a[0];
		int small2=a[1];
		for(int k:a)
		{
			if(k<small1)
			{
				small2=small1;
				small1=k;
	
			}
			else if(k<small2 && k!=small1)
			{
				small2=k;
			}
		}
			System.out.println(small2);
		

	}
}




