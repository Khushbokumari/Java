import java.util.Scanner;

public class shift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int x = scanner.nextInt();
        String str = scanner.next();
        int x = str.length();
        shift swaps = new shift();
        shift.swaps(str, 0, x - 1);
        // System.out.println(str+""+x);
    }

    private static void swaps(String str, int l, int r) {

        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                swaps(str, l + 1, r);
                str = swap(str, l, i);
            }
        }

    }

    public static String swap(String a, int i, int j) {
        // int i,j;
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);

    }

}
