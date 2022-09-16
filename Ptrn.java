import java.util.Scanner;

public class Ptrn {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int a,i,j,space=1;
        System.out.println("enter no ");
        a=t.nextInt();
        space=a-1;
        for(j=1;j<=a;j++)
        {
            for(i=1;i<=space;i++)
            {
                System.out.print("");
            }
            space--;
            for(int k=1;k<=2*j-1;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        space=1;
        for(j=1;j<=a-1;j++)
        {
            for(i=1;i<=space;i++)
            {
                System.out.println("");
            }
            space++;
            for(i=1;i<=2*(a-j)-1;i++)
            {
                System.out.print("*");
            }
        }System.out.println("");
    }
    
}
