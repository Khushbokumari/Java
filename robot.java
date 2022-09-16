import java.util.Scanner;

public class robot {
    public static int robot(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }

        return robot(m - 1, n) + robot(m, n - 1);

    }

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int m = d.nextInt();
        int n = d.nextInt();
        System.out.println(robot(m, n));
        // int r=d.nextInt();

    }

}
