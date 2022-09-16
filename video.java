import java.util.Scanner;

public class video {
    public static void main(String[] args) {
        int B = 0, N;
        Scanner sc = new Scanner(System.in);
        try {
            B = Integer.parseInt(sc.next().trim());
            N = Integer.parseInt(sc.next().trim());
            int zi;

            for (int i = 0; i < N; i++) {
                zi = Integer.parseInt(sc.next().trim());
                B = B - ((zi % 2) + (zi / 2));
            }
        } catch (Exception e) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        if (B >= 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
