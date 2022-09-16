import  java.util.Scanner;
class Even1
      {
public static void main(String...s)
{     Scanner sc=new
      Scanner(System.in);
      int num;
   do
      {num=sc.nextInt();
       if(num>0)
       {if(num%2==0)
        System.out.print("even no");
         else
        System.out.print("o");
      }
     }
   while(num>=0);
  }
}
