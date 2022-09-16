import java.util.*;
class Key
{
public static void main(String...s)
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
System.out.println(usa());
}
public static String usa()
{ String s1="";
StringBuffer s2=new StringBuffer();
for(int i=0;i<s1.length();i++)
{ char c=s1.charAt(i);
if(i%2==0)
{
if(c==122)
c=(char)(c-25);
else
{
c=(char)(c+1);
}
s2.append(c);
}
else
s2.append(c);
}return s2.toString();
}
}