package arrayprogram;

public class ReverseoddimdexString {

	public static void main(String[] args) {
		String str="my name is pritipriya samal";
		String []str1=str.split(" ");
		for(int i=0;i<=str1.length;i++)
		{
			String val=str1[i];
			if(i%2 !=0)
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
