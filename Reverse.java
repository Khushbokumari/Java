import java.util.Scanner;

 public class Reverse {
public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    String sr=sc.nextLine();
    StringBuffer sb=new StringBuffer(sr);
    sb.reverse();
    System.out.println(sb);
    
}     
}
