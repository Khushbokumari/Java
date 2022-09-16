import java.util.Scanner;

public class step {
    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static int countWays(int s) {
        return fib(s + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Number of ways=" + countWays(r));
    }

}
