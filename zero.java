
import java.util.*;

public class zero {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int M = S.nextInt();
        int N = S.nextInt();
        while (M <= N) {
            if (N <= 9)
                System.out.print(M);
            else if (N <= 99)
                System.out.printf("%02d\n", M);
            else
                System.out.printf("%03d\n", M);
            M++;
        }
    }

}
