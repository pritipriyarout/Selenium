package arrayprogram;

public class BigSecondBigThirdBig {

	public static void main(String[] args) {
		int []arr= {10,50,62,8,20,5,41};
		int big=arr[0];
		int sbig=arr[0];
		int tbig=arr[0];
 for(int i=0;i<arr.length;i++)
 {
       if(big<arr[i])
       {
    	   tbig=sbig;
    	   sbig=big;
    	   big=arr[i];
       }
       else if(sbig<arr[i])
       {
    	   tbig=sbig;
    	   sbig=arr[i];
       }
       else  if(tbig<arr[i])
        {
    	   tbig=arr[i];
       }
 }
 System.out.println(big);
 System.out.println(sbig);
 System.out.println(tbig);
	}

}
