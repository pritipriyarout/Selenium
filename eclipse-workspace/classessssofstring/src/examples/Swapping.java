package examples;

public class Swapping {

	public static void main(String[] args) {
		String s1="Royal";
		String s2=" ";
		s2=s2+s1.charAt(s1.length()-1);
		for(int i=1;i<=s1.length()-2;i++)
		{
			char ch=s1.charAt(i);
			s2=s2+ch;
		}
				s2=s2+s1.charAt(0);
		System.out.println(s2);

	}
}



		



	





