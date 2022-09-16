import java.util.Scanner;
class Palindrome
{
public static void main(String...s)
{
int r,sum=0,temp;
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
temp=n;
while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum)
System.out.println("palindrome no");
else
System.out.print("not palindrome");
}
}