import java.util.Scanner;

public class mint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int temp = x;
        int sum = temp;
        for (int i = 1; i < y; i++) {
            temp = sum - 1;
            sum += temp;
        }
        System.out.println(sum);

    }

}
