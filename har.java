import java.util.*;
class Char
{  
    public static void main(String[] args) 
{ 
        Scanner sc=new Scanner(System.in);

 
        String st=sc.nextLine();  
  
        //Displays individual characters from given string  
        System.out.println("Individual characters from given string: ");  
  
        //Iterate through the string and display individual character  
        for(int i = 0; i < st.length(); i++){  
            System.out.print(st.charAt(i) + " ");  
        }  
    }  
}  