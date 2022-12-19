/*
    DATE->16/12/22
    define a class base with data members string name , int age and member methods are getBaseData() and showBaseData()
    define subclass child with data members string branch int semester and member methods are getChildData() and showChildData() 
    child is subclass that is derived from base superclass initialise an object of child class and excess all its members as well 
    as member methods of super class to show the existence of inheritance among them. implement this program in java.
*/
import java.util.Scanner;
class Base
{
    int age;
    String name;
    Scanner scan = new Scanner(System.in);
    void getBaseData()
    {
        System.out.println("enter name of you child : ");
        name = scan.nextLine();
        System.out.println("enter age of you child : ");
        age = scan.nextInt();
    }
    void showBaseData()
    {
        System.out.println("Name is : "+name);
        System.out.println("age is : "+age);
    }
}
class Child extends Base
{
    int semester;
    String branch;
    Scanner scan = new Scanner(System.in);
    void getChildData()
    {
        System.out.println("enter branch of you child : ");
        branch = scan.nextLine();
        System.out.println("enter semester of you child : ");
        semester = scan.nextInt();
    }
    void showChildData()
    {
        System.out.println("branch is : "+branch);
        System.out.println("semester is : "+semester);
    }
    public static void main(String[] args)
    {
        Child obj = new Child();
        obj.getBaseData();
        obj.getChildData();
        obj.showBaseData();
        obj.showChildData();
    }
}
