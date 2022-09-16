import java.util.Scanner;
class Prime
{
public static void main(String...s)
{
int a,b,c;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
for(b=2;b<=Math.sqrt(a);b++);
{
if(a%b==0)
{
System.out.println("Not prime");
c++;
}
}
if(c!=1)
System.out.println("Prime");
}
}