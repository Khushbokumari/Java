import java.util.Scanner;

public class path {
    public static void paths(int n) {
        if (n % 2 == 0) {
            n = n / 2;
            n = 2 * (n - 1);
            System.out.println(n);
        } else {
            n = (n / 2) + 1;
            n = 2 * (n - 1);
            System.out.println(n);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        paths(x);
    }
}
