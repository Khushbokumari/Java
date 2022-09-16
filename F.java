import java.util.Scanner;
class Fibo
{
public static void main(String...s)
{
int a,b,c,d,e;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
e=sc.nextInt();
System.out.print(a+""+b);
for(d=0;d<e;d++)
{

c=a+b;
a=b;
b=c;
System.out.print(""+c);
}
}
}