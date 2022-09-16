import java.util.*;
 class Co    
{    
    public static void main(String[] args)
 {  
         Scanner sc=new Scanner(System.in);  
        String st=sc.nextLine();    
        int count = 0;    
            
        //Counts each character except space    
        for(int i = 0; i < st.length(); i++) {    
            if(st.charAt(i) != ' ')    
                count++;    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in a string: " + count);    
    }    
}     