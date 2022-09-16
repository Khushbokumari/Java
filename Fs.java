import java.util.Scanner;
class Factorial
{
public static void main(String...s)
{
int n;
int i,fact=1;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.print("Factorial of no is:"+fact);
}
}
