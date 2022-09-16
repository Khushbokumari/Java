import java.util.Scanner;
class Arms
{
public static void main(String[]args)
{
int n;
int temp,a=0,b=0,sum=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
temp=n;
while(temp>0)
{
temp=temp/10;
a++;
}
temp=n;
while(temp>0)
{
b=temp%10;
sum=sum+(int)(Math.pow(b,a));

temp=temp/10;
}
if(n==sum)
{
System.out.println("Armstrong");
}
else
{
System.out.print("not armstrong");
}
}
}
