package arrayprogram;

public class CountFrequencyofEachWord {

	public static void main(String[] args) {
		String str="good friend is badly needed";
	String[] str1=str.split(" ");
	for(int i=0;i<=str1.length-1;i++)
	{
		String val=str1[i];
		System.out.println(str1[i]+"----->"+val.length());
	}
	}
}
