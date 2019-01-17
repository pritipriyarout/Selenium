package arrayprogram;

public class Himalaya {

	public static void main(String[] args) {
		String s1="himalaya";
		String s2=" ";
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(ch=='i')
			{
				s2=s2+'e';
			}
			else if(ch=='a')
			{
				s2=s2+"ex";
			}
			else
			{
				s2=s2+ch;
			}
		}
System.out.println(s2);
	}

}
