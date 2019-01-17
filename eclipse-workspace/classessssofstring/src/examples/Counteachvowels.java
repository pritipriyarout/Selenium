package examples;

public class Counteachvowels {

	public static void main(String[] args) {
		String s1="Slice Delicious";
		int acount=0;
		int ecount=0;
		int icount=0;
		int ocount=0;
		int ucount=0;
		s1=s1.toLowerCase();
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(ch=='a')
			{
				acount++;
			}
			else if(ch=='e')
			{
				ecount++;
			}
			else if(ch=='i')
			{
				icount++;
			}
		
			else if(ch=='o')
			{
				 ocount++;
			}
		
			else if(ch=='u')
			{
				ucount++;
			}
		
			
		
		}
		System.out.println("a count is"+acount);
		System.out.println("e count is"+ecount);

		System.out.println("i count is"+icount);

		System.out.println("o count is"+ocount);

		System.out.println("u count is"+ucount);


	}

}

	


