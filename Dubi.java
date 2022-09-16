import java.util.Scanner;

public class Dubi {
    public static void main(String[]args) {
     int count; 
     int i,j;
     
    Scanner sc=new Scanner(System.in);
    String w=sc.next();
    int length=w.length();
    //char ar[]=new char[length];
    char st[]=w.toCharArray();
      
    {
        System.out.println(w.toUpperCase());
        System.out.println(w.toLowerCase());
    }
    
    for( i=0;i<length;i++)
   count=1;
    {
     for( j=  i+1;j<length;j++)
     {
         if(st[i]==st[j] && st[i]!='0')
         {
             count++;
             st[j]='\0';
         }
     }
     for( i=0;i<length;i++ )
    
         if(count >1 && st[i]!='\0')
     {
         System.out.println(st[i]);
     }


    }
}

    
}
}
