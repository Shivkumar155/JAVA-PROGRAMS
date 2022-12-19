/*
      DATE->16/12/22
      Write a java program where define a class compute with overloaded method add(),
      add(int , int) , add(double , double , double).
*/
import java.util.Scanner;
class Main
{
    
    void add()
    {
        Scanner scan = new Scanner(System.in);
        int x , sum=0 ,y;
        System.out.println("Enter two integers : ");
        x=scan.nextInt();
        y=scan.nextInt();
        sum=x+y;
        System.out.println("sum is : "+sum);
    }
    int add(int x , int y)
    {
        return(x+y);
    }
    double add(double x , double y , double z)
    {
        return(x+y+z);
    }
    public static void main(String[] args)
    {
         int a,b;
         int x , y , z;
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        obj.add();
        System.out.println("Enter two integers as parameters : ");
       
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(obj.add(a,b));
        System.out.println("Enter three values as parameters : ");
        
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        System.out.println(obj.add(x,y,z));
    }
}
