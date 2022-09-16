import java.util.Scanner;

public class range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int count;
        // int a= sc.nextInt();
        int first = sc.nextInt();
        int last = sc.nextInt();
        n = first;
        while (n <= last) {
            count = 0;
            int x = sc.nextInt();
            while (x <= n / 2) {
                if ((n % x) == 0) {
                    count++;

                }
                x++;
            }
            if (count == 0) {
                System.out.println(n);
                n++;
            }

        }

    }

}
