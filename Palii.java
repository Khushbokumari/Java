import java.util.Scanner;

public class Palii {
    public static void main(String... s) {
        int r, sum = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("palindrome no");
        else
            System.out.print("not palindrome");
    }
}
