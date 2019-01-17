package arrayprogram;

public class StoreFiveColorDatabase {

	public static void main(String[] args) {
		String[] colors=new String[5];
		colors[0]="pink";
		colors[1]="blue";
		colors[2]="white";
		colors[3]="black";
		colors[4]="red";
		for(int i=0;i<=colors.length-1;i++)
		{
			System.out.println(colors[i]);
		}
System.out.println("the length of string at index 2 is"+colors[2].length());
System.out.println("the length of string at index 1 is"+colors[1].length());
System.out.println("the length of string at index 4 is"+colors[4].length());
System.out.println("the length of string at index 0 is"+colors[0].length());
	}

}
