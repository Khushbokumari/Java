import java.util.Scanner;

public class wall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, i = 0;
        float x = 18, y = 12, cost = 0, z;
        n = sc.nextInt();
        m = sc.nextInt();
        if (n < 0 || m < 0) {
            System.out.print("INVALID INPUT");
        } else if (n == 0 && m == 0) {
            System.out.print("Total estimated Cost : 0.0");
        } else {
            for (i = 0; i < n; i++) {
                z = sc.nextFloat();
                cost += x * z;
            }
            for (i = 0; i < m; i++) {
                z = sc.nextFloat();
                cost += y * z;
            }
            System.out.printf("Total estimated Cost : %.1f", cost);
        }
    }
}
