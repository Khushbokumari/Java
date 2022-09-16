import java.util.Scanner;

public class stu {
    public static int found(String[] arr, String s) {
        int count = 0;
        for (int j = 0; j < arr.length; j++)
            if (s.equals(arr[j]))
                count++;
        return count;
    }

    public static void gets(String[] arr, String q[]) {
        for (int i = 0; i < q.length; i++)
            System.out.println(found(arr, q[i]) + "");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // String s = sc.nextLine();
        String[] arr = new String[n];
        String[] q = new String[n];
        gets(arr, q);

    }

}
