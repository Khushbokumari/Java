import java.util.Scanner;

public class Cal {
      
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int s=sc.nextInt();
    
    {
        try
        {
            if(r>0&&s>0)
            {
                double result = Math.pow(r, s);
                System.out.println("Answer = " + result);

            }else if(r==0&&s==0)
            {
                throw new Exception("r and s should not be zero");
            }
            else if(r<0&&s<0)
            {
                throw new Exception("r and s should not be negative");
            }

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
    public static void main(String[] args) 
    {
         long power(int num,int power)
                {
            double result = Math.pow(num,power);
            return(long)result;
        }
    
    }

    
   
       
    

