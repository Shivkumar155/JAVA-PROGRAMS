/*define a class student with data members [string name , int age and float cgpa] mamber methods [getdata() and showdata()
 for taking input and displaying the output respectively].Initialize an object of the class and the access the member 
 method . implement the scenario in java */
 import java.util.Scanner;
 public class student 
{
    int age;
    String name;
    float cgpa;
    Scanner scan = new Scanner(System.in);
    void getData()
    {
        System.out.println("Enter details of student : ");
        System.out.println("enter the name of student : ");
        name=scan.nextLine();
        System.out.println("enter age of student : ");
        age=scan.nextInt();
        System.out.println("enter cgpa of student : ");
        cgpa=scan.nextFloat();
    }
    void showData()
    {
        System.out.println("Student Report : ");
        System.out.println("Name of student is : "+name);
        System.out.println("Age of student is : "+age);
        System.out.println("CGPA of student is : "+cgpa);
    }
    public static void main(String[] args) 
    {
        int size;
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of student (maximum 5) : ");
        size=scan.nextInt();
        student[] obj= new student[size];
        for(i=0;i<size;i++)
        {
            obj[i]= new student();
        }
        for(i=0;i<size;i++)
        {
            obj[i].getData();
        }
        for(i=0;i<size;i++)
        {
            obj[i].showData();
        } 
    }
}
