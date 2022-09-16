import java.util.Scanner;

public class game {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int even = 0;
        int odd = size - 1;
        for (int i = 0; i < size; i++) {
            while (even < odd) {
                while (arr[even] % 2 == 0) {
                    even++;
                }

                while (arr[odd] % 2 == 1) {
                    odd--;
                }
                if (even < odd) {
                    int temp = arr[even];
                    arr[even] = arr[odd];
                    arr[odd] = temp;

                }
            }

            for (i = 0; i < size; i++)
                System.out.print(arr[i] + "");

        }
    }
}