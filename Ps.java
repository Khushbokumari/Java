import java.util.Scanner;
class Prime
{
public static void main(String...s)
{
int n,i;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
i=sc.nextInt();
for(i=1;i<n;i++)
{
if(n%i==0)
System.out.println("prime no");
else
System.out.println(" not prime no");
}
}
}