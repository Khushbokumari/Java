import java.util.*;
import java.util.Collections;

public class Palindrome {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num != 0) {
            list1.add(sc.nextInt());
            num--;
        }
        LinkedList<Integer> List2 = new LinkedList<Integer>(list1);
        Collections.reverse(List2);
        if (list1.equals(List2)) {
            System.out.println("palindrome");

        } else {
            System.out.println("not palindrome");
        }
    }
}
