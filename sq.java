public class sq {
    public static void main(String[] args) {
        int count, i = 0;
        String s;
        count = args.length;
        System.out.println("Number of arguments: " + count);
        while (i < count) {
            s = args[i];
            i = i + 1;
            System.out.println(i + ":" + "java is" + s + "!");

        }

    }

    // System.out.println("area=" + area);

}
