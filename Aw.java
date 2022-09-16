import java.util.*;
class Num
{
void Fact()
{
int n,f=1;
while(n>0)
{
fact=f*n;
n--;
}
}
class Prm extends Num
{
void Prime()
{
int a,b,c=0;
for(a=1;a<=b;a++)
{
if(b%10==0)
c++;
}
if(c==2)
System.out.println("prime");
else
System.out.println("not prime");
}
}
class Arm extends Prm
{
void Arm()
{int n;
int temp,j=0,k=0,sum=0;
temp=n;
while(temp>0)
{
temp=temp/10;
j++;
}
while(temp>0)
{
k=temp%10;
sum=sum+(Math.pow(k,j));
temp=temp/10;
}



