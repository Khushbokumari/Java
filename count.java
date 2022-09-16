import java.util.Scanner;

public class count {
    public static void no(int a) {
        int b = 0;

        int c[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        while (a > 0) {
            int d = a % 10;
            c[a]++;
            a = a / 10;
        }
        for (int i = a; i < c.length; i++) {
            if (c[i] == 1) {
                b++;

            }
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // int g = sc.nextInt();
        no(a);
    }

}
