import java.util.Scanner;
 class Diamn {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        int i,j,k;
        int n=q.nextInt();
        int space=n/2;
        int w=1;
        for( i=1;i<=n;i++)
        {
            for(j=1;j<=space;j++)
            {
                System.out.print("");
            }
        }
        for( k=1;k<=w;k++)
        {
            System.out.print("*");
        }
        System.out.println();
        if(i<=(n/2))
        {
            space=space-1;
            w=w+2;
            
        }
        else
        {
            space=space+1;
            w=w-2;
        }
    }
    
}
