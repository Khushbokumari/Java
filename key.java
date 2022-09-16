import java.util.Scanner;

public class key {
    public static void main(String[] args) {
        int flag = 0;
        Scanner scanner = new Scanner(System.in);
        String str[] = { "break", "case", "continue", "default", "defer", "else", "for", "goto", "if", "map", "range",
                "return", "struct", "type", "var" };
        String s = scanner.nextLine();

        for (int i = 0; i < 32; i++)

        {

            if (str[i].equals(s))

            {

                flag = 1;
                break;

            }

        }

        if (flag == 1)

            System.out.println(s + "" + "is a keyword");

        else

            System.out.println(s + "" + "is not a keyword");

    }

}
