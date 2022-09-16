import java.util.Scanner;

public class board {
    public static void main(String[] args) {

        int target, score, attempt = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        target = sc.nextInt();
        while (sum < target) {
            score = sc.nextInt();
            sum = sum + score;
            attempt++;
        }
        System.out.println("the no of turns is:" + attempt);
    }
}