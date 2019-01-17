package examples;

public class Spaces {

	public static void main(String[] args) {
		String s1="java developer";
		int count=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(ch==' ')
			{
				count++;
			}
		}
		System.out.println(count);

	}
}


		

	


