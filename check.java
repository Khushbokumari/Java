import java.io.*;

public class check {
    public static void main(String[] args) throws Exception {
        InputStreamReader b = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(b);
        String a = br.readLine();
        System.out.println(Integer.parseInt(a, 17));

    }

}
