import java.util.Scanner;

public class ugly {
    public static int num(int a, int b) {
        while (a % b == 0) {
            a = a / b;
        }
        return a;

    }

    public static int no(int no) {
        no = num(no, 2);
        no = num(no, 3);
        no = num(no, 5);
        return (no == 1) ? 1 : 0;
    }

    public static int s(int c) {
        int i = 1;
        int count = 1;
        while (c > count) {
            i++;
            if (no(i) == 1)
                count++;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int no = s(d);
        int g = s(e);
        System.out.println(no + " " + g + " ");

    }

}
