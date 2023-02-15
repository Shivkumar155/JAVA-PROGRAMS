
                                     /* Creating and calling parameterized function in java*/ 

import java.util.Scanner;
public class ParFunc
{
	int f1(int x,int y)
	{
		int product = x*y;
		System.out.println("product is :"+product);
		return 0;
	}
	public static void main(String[] args)
	{
		try (Scanner scan = new Scanner(System.in)) {
			ParFunc obj = new ParFunc();
			int x,y;
			//obj.f1(10,20);
			System.out.println("enter two integers : ");
			x=scan.nextInt();
			y=scan.nextInt();
			obj.f1(x,y);
		}
	}
}
