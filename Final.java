class Final
{
int a=30;
public static void main(String...s)
{
final int assign;
Final b=new Final();
process(b);
System.out.println(b.a);
process(b);
assign=b.a;
System.out.println(assign);
}
public static void process(Final a)
{
a.a=a.a+5;
}
}