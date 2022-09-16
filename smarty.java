import java.text.DecimalFormat;
import java.util.*;

public class smarty {
    public static void main(String[] args) {

        DecimalFormat obj = new DecimalFormat("0000");
        String str = obj.format(13);
        System.out.print(str);

    }

}
