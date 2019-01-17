package arrayprogram;

public class MergeTwoArrayStoreInDifferentArray {

	public static void main(String[] args) {
	int[] a= {10,20,30};
	int[] b= {40,50,60};
	int k=0;
	int[] c=new int[a.length+b.length];
	for(int i:a)
	{
		c[k++]=i;
	}
   for(int j:b)
   {
	   c[k++]=j;
   }
   for(int l:c)
   {
	   System.out.println(l);
   }
	}

}
