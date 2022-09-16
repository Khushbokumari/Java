import java.util.Scanner;

public class intr {
    public static int countNumber(int a) {
        int x = a % 10;
        int y = a - (9 * (9 - x));
        if (y >= 9 && y % 10 == 9) {
            return 10 - x;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(countNumber(a));

    }

}
