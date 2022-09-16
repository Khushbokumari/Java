import java.util.Scanner;

public class ciper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        String y = sc.nextLine();

        int k = Integer.parseInt(sc.nextLine());
        k = k % 26;
        System.out.println(encrypt(y, x, k));
        sc.close();

    }

    private static String encrypt(String y, int x, int shift) {
        StringBuilder s = new StringBuilder();
        char c;
        for (int i = 0; i < x; i++) {
            c = y.charAt(i);
            if (Character.isLetter(c)) {
                c = (char) (y.charAt(i) + shift);
                if ((Character.isLowerCase(y.charAt(i)) && c > 'z') || (Character.isUpperCase(y.charAt(i)) && c > 'Z'))
                    c = (char) (y.charAt(i) - (26 - shift));
            }
            s.append(c);
        }

        return s.toString();
    }

}
