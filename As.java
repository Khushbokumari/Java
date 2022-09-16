import java.util.Scanner;

public class As {
    public static void main(String[] args) { 
         Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int a[]=new int[n];
        int b[]=new int[n];

           for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                b[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                c=1;
                if(a[i]!=-1){
                    for(int j=i+1;j<n;j++){
                        if(a[i]==a[j])
                        {
                            c++;
                            a[j]=-1;
                        }
                    }
                    b[i]=c;
                }
            }
            //
            for(int i=0;i<n;i++)
            {
                if(a[i]!=-1){
                    if(b[i]==1)
                    {
                        System.out.println(a[i]);
                    }

                }
                System.out.println("unique no in the array is:");
            }
           return ;
        }
    
        
    }

    

