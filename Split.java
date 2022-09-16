import java.util.Scanner;

public class Split 
{   
public static void SplitString(String str)
{  
try { 
    String[] arr=str.split("/");
    for(int i=0; i< arr.length; i++)  
    {  

        System.out.println("splitted string at index "+i+"is:"+arr[i]);  
    }  
         
} catch (Exception e) 
{
    System.out.println(e);
}
finally
{
    System.out.println("inside finally block");
}
}
public static void main(String[]args) 
{   
Scanner sc=new Scanner(System.in); 
String str = sc.nextLine();  
if(str.length()>2)
{
    SplitString(str);;
} 
else
{
    SplitString(null);
}
}
}