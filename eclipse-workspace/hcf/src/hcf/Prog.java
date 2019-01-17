package hcf;

public class Prog {

	public static void main(String[] args) {
		int i;
    for( i=2;i<=8;i++)
    {
    if(i%3==0)
    {
    	System.out.println("CLOUD");
    }
    else if(i%7==0)
    {
    	System.out.println("NIX");
    }
    else if(i%3==0 && i%7==0)
    {
    	System.out.println("CLOUDNIX");
    }
    else
    {
    
    System.out.println(i);
	}
    }
}
}
