package arrayprogram;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str="java is everything";
		String[] str1=str.split(" ");
		for(int i=0;i<=str1.length-1;i++)
		{
			String val=str1[i];
			String rev=" ";
			for(int j=val.length()-1;j>=0;j--)
			{
				rev=rev+val.charAt(j);
			}
			System.out.print(rev+" ");
			}
			
		}
				
    

	}


