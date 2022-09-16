import java.util.Scanner;

//import javax.lang.model.util.ElementScanner14;

public class Revs {
    public static void main(String[]args) {
        
    Scanner sv=new Scanner(System.in);
    String  st=" ";
    st=sc.nextLine();
    int l=st.length();
    StringBuffer sb=new StringBuffer(st);
    rev(sb,0,l-1);
    int start=0;
    for(int i=0;i<l;i++)
    {
        if(sb.charAt(i)=='\0')

        {
            rev(sb,start,i-1);
            start=i+1;
        }

        else
        if(i==l-1)
        {
            rev(sb,start,i);
        }
    }
    System.out.println(sb);
}
public static void rev(StringBuffer sb,int sti,int lasti)
{
    while(sti<lasti)
    {
        char temp=sb.charAt(sti);
        sb.setCharAt(sti,sb.charAt(lasti));
        sb.setCharAt(lasti, temp);
        sti++;
        lasti--;
    }
}


    
}
