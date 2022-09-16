import java.util.Scanner;

public class ug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        checkUglyNumber(a);
    }

    public static void checkUglyNumber(int a) {
        int num = a;
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 3 == 0) {
                num /= 3;
            } else if (num % 5 == 0) {
                num /= 5;
            } else {
                System.out.println(a + "not a ugly number");
                return;
            }
        }

        System.out.println(a + "is a ugly number");
    }

}
