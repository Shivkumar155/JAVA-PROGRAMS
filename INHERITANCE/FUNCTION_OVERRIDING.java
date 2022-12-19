/*
    DATE -> 19/12/22
    define a class base with member methods void show() define a subclass child inherit the properties of base class
    child modifies the definition of show method prove that for derived class show method has two different definition
    exist in both class.
*/
class Base
{
   
    void show()
    {
        System.out.println("hello I'm base");
    }
}
class Main extends Base
{
    void show()
    {
        System.out.println("hello I'm child");
    }
    public static void main(String[] args)
    {
        Base B;
        Base obj1 = new Base();
        Main obj2 = new Main();
        B=obj1;
        B.show();
        B=obj2;
        B.show();
    }
}
