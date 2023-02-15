/*
        CREATING ONE DIMENTIONAL ARRAY OF SIZE 5
*/
import java.util.Scanner;
public class Arr
{
	public static void main(String[] args)
	{
		try (Scanner scan = new Scanner(System.in)) {
			int[] A=new int[5];
			int i;
			System.out.println("enter elements : ");
			for(i=0;i<A.length;i++)
			{
				A[i]=scan.nextInt();
			}
			System.out.println("entered array is : ");
			for(i=0;i<A.length;i++)
			{
				System.out.println(A[i]);
			}
		}
	}
}
