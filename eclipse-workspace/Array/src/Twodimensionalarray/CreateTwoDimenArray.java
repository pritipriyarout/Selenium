package Twodimensionalarray;

public class CreateTwoDimenArray {

	public static void main(String[] args) {
		int[][] arr= {{1,2},{3},{5,6,8,9}};
		System.out.println(arr[2][1]);
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				System.out.println(arr[i][j]);
			}
			
		}

	}

}
