class A
{
void dance()
{
System.out.println("Hello class A");
}
}
class B extends A
{
void run()
{
System.out.println("hello class B");
}
}
class D
{
public static void main(String args[])
{

B n1=new B();
n1.dance();
n1.run();
}
}
