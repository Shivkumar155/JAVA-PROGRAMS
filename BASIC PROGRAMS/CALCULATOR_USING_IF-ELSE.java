
                                                  /*Creating calculator with the help of if-else statements*/

import java.util.Scanner;
public class Calc
{
	public static void main(String[] args)
	{
		int x;
        int y;
		int ch;
		do{
		System.out.println("enter operations : ");
		System.out.println("press 1 for addition : ");
		System.out.println("press 2 for substraction : ");
		System.out.println("press 3 for multiplication : ");
		System.out.println("press 4 for division : ");
		int cho;
		try (Scanner scan = new Scanner(System.in)) {
            cho=scan.nextInt();
            if(cho==1)
            {
            	System.out.println("enter two integers : ");
            	x=scan.nextInt();
            	y=scan.nextInt();
            	int sum=0;
            	sum=x+y;
            	System.out.println("sum is : "+sum);	
            }
            else if(cho==2)
            {
            	System.out.println("enter two integers : ");
            	x=scan.nextInt();
            	y=scan.nextInt();
            	int diff=0;
            	diff=x-y;
            	System.out.println("difference is : "+diff);	
            }
            else if(cho==3)
            {
            	System.out.println("enter two integers : ");
            	x=scan.nextInt();
            	y=scan.nextInt();
            	int mul=0;
            	mul=x*y;
            	System.out.println("product is : "+mul);	
            }
            else if(cho==4)
            {
            	System.out.println("enter two integers : ");
            	x=scan.nextInt();
            	y=scan.nextInt();
            	int div=0;
            	div=x/y;
            	System.out.println("division is : "+div);	
            }
            else
            {
            	System.out.println("enter valid choice");
            }
            System.out.println("press 1 to continue  : " );
            ch=scan.nextInt();
        }
		}while(ch==1);
	}
}
