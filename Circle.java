import java.util.Scanner;

public class Circle {
    public static int circle(int m, int n) {
        if (m == 1) {

            return (circle(m - 1, n) + n - 1) % n + 1;
        }
        return 1;

    }

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int m = d.nextInt();
        int n = d.nextInt();
        System.out.println("the safe place is:" + circle(m, n));
        // int r=d.nextInt();

    }

}
