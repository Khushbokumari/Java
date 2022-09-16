import java.util.Scanner;

public class Patrn {
    public static void main(String[] args) {
        Scanner as=new Scanner(System.in);
        int ab=1;
        int r=as.nextInt();
        for(int i=1;i<=r;i++)
      //  {
            //System.out.println("r");
            {
               for(int j=0;j<=i;j++)
               {
                   System.out.print(ab+"");
                   ab++;
               }
               System.out.println("");
            }
            
      //  }
    }
    
}
