import java.util.*;


  public class Code {

 public static void main(String...s)
 { Scanner sc=new Scanner(System.in);

  String s1= sc.nextLine();
  String s2= "";

  int count = 1;
  for (int i = 0; i <s1.length(); i++) {

  
   count = 1;
   while (i < s1.length() - 1 && s1.charAt(i) == s1.charAt(i + 1)) {
    count++;
    i++;
   }
   s2 = s2 + s1.charAt(i) + count;
  }
  System.out.println("Input data : " +s1);
  System.out.println("string code is : " + s2);

 }

}