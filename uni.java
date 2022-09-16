import java.util.Scanner;

public class uni {
    public static void no(int a, int b) {
        int h = 0;
        for (int i = a; i <= b; i++) {
            int d = i;
            boolean e[] = new boolean[10];
            while (d != 0) {
                if (e[d % 10])
                    break;
                e[d % 10] = true;
                d = d / 10;

            }
            if (d == 0)
                System.out.println(i);
            h++;
        }
        System.out.println(h);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int h = 0;
        no(a, b);
        // System.out.println(h);
    }
}
