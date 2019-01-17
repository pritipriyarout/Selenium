package javaprog;

public class Prog {

	public static void main(String[] args) {
    int n=2;
    if(n%3==0)
    {
    	System.out.println("CLOUD");
    }
    else if(n%7==0)
    {
    	System.out.println("NIX");
    }
    else if(n%3==0 && n%7==0)
    {
    	System.out.println("CLOUDNIX");
    }
	}

}
