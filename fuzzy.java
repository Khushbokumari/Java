import java.util.Scanner;

public class fuzzy {
    public static void Time(int n) {
        if (n == 0)
            System.out.println("Time Estimated : 0 Minutes");
        else if (n > 0 && n <= 2000)
            System.out.println("Time Estimated : 25 Minutes");
        else if (n > 2000 && n <= 4000)
            System.out.println("Time Estimated : 35 Minutes");
        else if (n > 4000 && n <= 7000)
            System.out.println("Time Estimated : 45 Minutes");
        else
            System.out.println("Time Estimated :INVALID INPUT");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Time(a);

    }

}
