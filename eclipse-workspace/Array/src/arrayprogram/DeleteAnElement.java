package arrayprogram;

public class DeleteAnElement {

	public static void main(String[] args) {
		int[] a= {10,20,70,80,6,8};
	    int[] a1=new int[5];
	    int index=2;
	    for(int i=0;i<=a1.length-1;i++)
	    {
	    	if(i<index)
	    	{
	    		a1[i]=a[i];
	    	}
	    	else if(i>index) {
	    		a1[i]=a[i+1];
	    	}
	    	else
	    	{
	    		a1[i]=a[i+1];
	    	}
	    	System.out.println(a1[i]);
	    	}
	    }
	

	}


