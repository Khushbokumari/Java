
class Study
{
void sleep()
{
System.out.println("Sleeping");
}
}
class Aies extends Study
{
void bore()
{
System.out.println("boring");
}
}
class Oops extends Aies
{
void interst()
{
System.out.println("intersting");
}
}
class Test
{
public static void main(String...s)
{
Oops o=new Oops();
o.sleep();
o.bore();
o.interst();
}
}





