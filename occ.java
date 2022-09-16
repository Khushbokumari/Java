import java.util.Scanner;

public class occ {
    public static int count(int arr[], int m, int n) {
        int i = first(arr, 0, n - 1, m, n);
        if (i == -1)
            return i;
        int j = first(arr, i, n - 1, m, n);
        return j - 1 + 1;

    }

    public static int first(int arr[], int x, int y, int m, int n) {
        if (y >= x) {
            int c = (x + y) / 2;
            if ((c == 0 || m > arr[c - 1]) && arr[c] == m)
                return c;
            else if (m > arr[c])
                return first(arr, (c + 1), y, m, n);
            else
                return first(arr, x, (c - 1), m, n);
        }
        return -1;
    }

    public static int last(int arr[], int x, int y, int m, int n) {
        if (y >= x) {
            int c = (x + y) / 2;
            if ((c == n - 1 || m < arr[c - 1]) && arr[c] == m)
                return c;
            else if (m < arr[c])
                return last(arr, x, (c - 1), m, n);
            else
                return last(arr, y, (c + 1), m, n);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int m = sc.nextInt();
        int n = arr.length;
        int s = count(arr, m, n);
        System.out.println(m + "" + s + "");

    }
}
