/*
      CREATING TWO DIMENTIONAL ARRAY OF SIZE 3
*/
import java.util.Scanner;
public class TwoD
{
	public static void main(String[] args)
	{
		int [][] A = new int [3][3];
		int i;
		int j;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the elements of 2-D array : ");
		for(i=0;i<A.length;i++)
		{
			for(j=0;j<A.length;j++)
			{
				A[i][j]=scan.nextInt();
			}

		}
		System.out.println("entered 2-D array is : ");
		for(i=0;i<A.length;i++)
		{
			for(j=0;j<A.length;j++)
			{
				System.out.print(" "+A[i][j]+" ");
			}
			System.out.println();

		}
	}
}
