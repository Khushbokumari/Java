class A
{
    void run()
    {
        System.out.println("hello class A");
    }
}
class B extends A
{
    void walk()
    {
        System.out.print("hello class B");
    }
}
class D
{
    public static void main(String args[])
     {
         B s=new B();
         s.run();
         s.walk();
        
    }
}