import java.util.Scanner;

public class Alice {
    public static int c(int a) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        int c = 0;
        if (a != 0) {
            c = c + a % 10;
            a = a / 10;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = c(a);
        while (res > 18) {
            res = c(res);
        }
        System.out.println("Alice should take the path->" + res);

        System.out.println("wrong path");

    }

}
