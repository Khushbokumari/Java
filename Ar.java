import java.util.Scanner;

public class Ar {
    public static int countt(int arr[], int m, int n, int x) {
        if (n < 1)
            return -1;
        int c = m + (n - 1) / 2;
        if (arr[c] == x)
            return c;
        if (arr[c] > x)
            return countt(arr, c - 1, m, x);
        return countt(arr, c + 1, n, x);

    }

    public static int countoccupied(int arr[], int n, int x) {
        int d = countt(arr, 0, n - 1, x);
        if (d == -1)
            return 0;
        int counts = 1;
        int e = d - 1;
        while (e >= 0 && arr[e] == x) {
            counts++;
            e--;
        }
        int f = d + 1;
        while (f < n && arr[f] == x) {
            counts++;
            f++;
        }
        return counts;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];// {1,2,2,2,2,3,4,7,8,9};
        // int size = sc.nextInt();
        int n = arr.length;
        int x = sc.nextInt();
        System.out.println(countoccupied(arr, n, x));
    }

}
