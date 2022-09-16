import java.util.Scanner;

public class Array_Sum{
public static void main(String[]args) {
    int i,sum=0;
    Scanner sc =new Scanner(System.in);
    {
        System.out.println("enter no of elements");
    }
    int arr=sc.nextInt();
    {
        System.out.println("enter all element");
    }
    int a[]=new int[arr];
    
    for(i=0;i<arr;i++)
    {
        a[i]=sc.nextInt();
       
        sum=sum+a[i];
        
            
        System.out.println("sum="+sum);

        
       
    }
    
}    
}
