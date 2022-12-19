/*
      DATE->19/12/22
      Calculating area of triangle and rectangle by using Inheritance in JAVA
*/

import java.util.Scanner;
class areaREC
{
    int l,b;
    Scanner scan = new Scanner(System.in);
    areaREC()
    {
        System.out.println("enter length , breadth of rectangle : ");
        l=scan.nextInt();
        b=scan.nextInt();
    }
    int calcR()
    {
        int area = 2*(l+b);
        return area;
    }
}
class Main extends areaREC
{
    int b,h;
    Scanner scan = new Scanner(System.in);
    Main()
    {
        System.out.println("enter base , height of triangle : ");
        b=scan.nextInt();
        h=scan.nextInt();
    }
    double calcT()
    {
        double area = (0.5)*b*h;
        return area;
    }
    public static void main(String[] args)
    {
        Main obj = new Main();
        System.out.println("area of rectangle is : "+obj.calcR());
        System.out.println("area of triangle is : "+obj.calcT());
    }
 }
