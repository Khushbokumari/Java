import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0, c = 0, d = 0, e = 0;
        while (a > 0) {
            d++;
            e = a % 10;
            if (d % 2 == 0)
                b += e;
            else
                c += e;
            a /= 10;
        }
        if (b < c)
            System.out.println(c - b);
        else
            System.out.println(b - c);
    }

}
