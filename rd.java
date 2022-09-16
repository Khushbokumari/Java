import java.io.DataInputStream;

public class rd {
    public static void main(String[] args) {
        // InputStream input = new DataInputStream
        DataInputStream in = new DataInputStream(System.in);
        int intNumber = 0;
        float floatNumber = 0.0f;
        try {
            System.out.println("enter ian integer:");
            intNumber = Integer.parseInt(in.readLine());
            floatNumber = Float.valueOf(in.readLine()).floatValue();
        } catch (Exception e) {
            System.out.println("intNumber=" + intNumber);
            System.out.println("floatNumber=" + floatNumber);
        }
    }

}
