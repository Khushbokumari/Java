import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int j = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int atebanana = 0;
        int atepeanut = 0;
        if (n < 0 && k < 0 || j < 0 || m < 0 || p < 0) {
            System.out.println("invalid input");
        } else {

            if (k > 0) {
                atebanana = m / k;
            }
            if (j > 0) {
                atepeanut = p / j;
            }
            n = n - atebanana - atepeanut;
            System.out.println("Number of monkeys lefts on the tree: " + n);

        }
    }
}