package examples;

public class Widwspace {

	public static void main(String[] args) {
		String s1="life    is    beautiful";
		String s2=" ";
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(ch!=' ')
			{
				s2=s2+ch;
			}
		}
		System.out.println(s2);

	}
}



		



	


