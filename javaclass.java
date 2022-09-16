import.java.util.scanner;
public class productOfDigits
{
    public static void main(String args[])
     {
         Scanner in=new Scanner(system.in);
         int num=in.nextInt();
         int ld,pro=1;
         if (num==0)
         {
             System.out.print(num);
         }
         else
         {
             while(num!=0)
             {
                 ld=num%10;
                 pro=pro*ld;
                 num=num/10
             }
             System.out.print(pro);
         }
        
    }
}