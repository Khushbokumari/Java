import java.util.Scanner;

public class Arra extends ArrayIndexOutOfBoundsException {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in); 
        int arr[] = new int[5];  
        int size=sc.nextInt();
        arr[5]=sc.nextInt();
        int marks=sc.nextInt();

                                             
                  
                for(int i=0;i<=arr.length;i++) {       
          
        
                     System.out.println(arr[i]);      
                  
                }  
          
            }  
          
         


    public static void ArrayIndexOutOfBoundsException(int arr[]) throws ArrayIndexOutOfBoundsException {
        try {
           
            System.out.println(arr[5]);
        } catch (Exception ex) {
            throw ex;
        }
    }
    
           
    }
    

