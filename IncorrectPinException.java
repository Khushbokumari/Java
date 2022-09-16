import java.util.Scanner;
public class IncorrectPinException extends Exception
{
    public IncorrectPinException(String message)
    {
        super(message);
    }
}
class Test
{
    public void IncorrectPinException(String setpin,String pin)throws IncorrectPinException
     { 
         if(setpin .equals(pin))
         {
             System.out.println("moile unlocked");
         }
         else
          {
              throw new IncorrectPinException("Please Try again");

         }

        
    }
}
class Pin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String setpin=sc.nextLine();
        String pin=sc.nextLine();
        Test t=new Test();
        try {
            t.IncorrectPinException(setpin,pin);
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
}
