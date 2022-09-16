import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String a=sc.nextLine();
        StringTokenizer b=new StringTokenizer(a);
        StringBuffer r=new StringBuffer();
        while(b.hasMoreTokens())
        {
            String a1=b.nextToken();
            if(a1=="")
            {
                r.append(a1);
                continue;

            }
            StringBuffer b1=new StringBuffer(a1);
            b1.reverse();
            r.append(b1);
        }
        r.reverse();
        System.out.println(r);
    }
    
}
