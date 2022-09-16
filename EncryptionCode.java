// Import Java khushi
import java.util.Scanner;
 
 class Code
 {
    public static void main(String[] args)
   {
       
        Scanner in = new Scanner (System.in);
       System.out.print("str=");
       String userMessage = in.nextLine();       
        System.out.print("key=");
        int userKey = in.nextInt();
       
        while (userKey > 6) 
   {
            
            userKey = in.nextInt();
        }
        String message = userMessage;
        int key = userKey;

        char [] chars = message.toCharArray();
        for(char i : chars) {
            i += key; 
            System.out.print(i);
        }
    }
}