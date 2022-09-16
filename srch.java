import java.util.Scanner;

public class srch {
    public static int Search(int arr[], int first, int last, int key) {
        if (last >= first) {
            int mid = first + (last - first) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return Search(arr, first, mid - 1, key);
            } else {
                return Search(arr, mid + 1, last, key);
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int arr[] = new int[size];
        int key = scanner.nextInt();
        int last = arr.length - 1;
        int result = Search(arr, 0, last, key);
        if (result == -1)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: " + result);
    }
}
