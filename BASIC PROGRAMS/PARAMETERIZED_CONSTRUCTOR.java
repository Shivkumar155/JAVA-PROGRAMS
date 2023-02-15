// parameterized constructor in java

import java.util.Scanner;
public class ParConst
{
	ParConst(int x , int y)
	{	int sum=x+y;
		System.out.println("sum is :"+sum);
	}
	public static void main(String[] args)
	{
		try (Scanner scan = new Scanner(System.in)) {
			int p , q;
			System.out.println("enter two integers : ");
			p = scan.nextInt();
			q = scan.nextInt();
			ParConst obj1 = new ParConst(p,q);
		}
	}
}
