
                          /*wap in java to take input from user for three integers variables and print the result*/ 

import java.util.Scanner;
public class Example1
{
	int a,b,c;
	public static void main(String[] args)
	{
		
		try (Scanner scan = new Scanner(System.in)) {
			Example1 obj = new Example1();
			System.out.println("enter 3 integers : ");
			obj.a=scan.nextInt();
			obj.b=scan.nextInt();
			obj.c=scan.nextInt();
			System.out.println("three integers are : "+obj.a+" "+obj.b+" "+obj.c);
		}
	}
}
