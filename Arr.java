import java.util.Scanner;

public class Arr {
    public static int getArr() {
        //Scanner sc=new Scanner(System.in);
         //[]=sc.nextInt();
       int a[];
       int s[];  
    int temp;
    for(int i=0;i<s;i++)
    {
        for(int j=i+1;j<s;j++)
        {
            if(a[i]>a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    return a[s-2];
}
public static void main(String[]args) {
    Scanner sc= new Scanner(System.in);
    int ar=sc.nextInt();
     int a[]=sc.nextInt();
    int m=sc.nextInt();
    int b[]=new int[ar];
  {
      System.out.println("second largest"+getArr(a, m));
      System.out.println("second largest"+getArr(b, m));
  }
    
} 
    
}


    
