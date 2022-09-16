import java.util.Scanner;
public class Pt {
    public static final int e=5;
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
       // int n=5;
        int n=q.nextInt();
        int space=n*5;
        int w=1;
        for(int a=1;a<=e;a++)
        {
            for(int i=w;i<=n;i++)
            {

            for(int j=space;j>=i;j--)
            {
                System.out.print("");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
        }System.out.println();
    }
        w=w+2;
        n=n+2;
    

    for(int i=1;i<=4;i++)
    {
      for(int j=space-3;j>=1;j--)
    
    {
        System.out.print("");
    }
    for(int k=1;k<=4;k++)
    {
       System.out.print("*"); 
    }
    System.out.println();
    
}
}
}




