import java.util.Scanner;

public class Swp {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        String ab=a.nextLine();
        String c=a.nextLine();
      //  { //System.out.println("value of ab:"+ab);
    //System.out.println("value of c:"+c);
        //System.out.println("before swapping");

  //  }
    ab=ab+c;
    c=ab.substring(0,ab.length()-c.length());
    ab=ab.substring(c.length());
    { System.out.println("after swapping");
        System.out.println(ab);
        System.out.println(c);

    }
    
}
}
