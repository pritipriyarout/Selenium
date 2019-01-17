package arrayprogram;

public class GivenElementPresent {

	public static void main(String[] args) {
		int[] a= {10,20,45,65};
		int ele=25;
		int flag=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==ele)
			{
				flag=1;
				break;
			}
		}
			if(flag==1)
			{
				
				System.out.println("element is present");
			}
			else
			{
				System.out.println("element is not present");
			}
		}
		

	
}
