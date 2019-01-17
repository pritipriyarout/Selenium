package arrayprogram;

public class ReverseMidElement {

	public static void main(String[] args) {
		String str="job is mandotory";
		String[] str1=str.split(" ");
		for (int i=0;i<=str1.length-1;i++)
		{
			int mid=str1.length/2;
			String val=str1[i];
			if(str1.length%2!=0 && i==mid)
			{
				String rev=" ";
				for(int j=val.length()-1;j>=0;j--)
				{
				rev=rev+val.charAt(j);
				}
				System.out.println(rev+" ");
			}
			else
			{
				System.out.println(val+" ");
			}
		}
				

	}

}
