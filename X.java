import java.util.*;

class A {
    void Area(int side) {
        res = side * side;
    }

    void Area(int len, int brd) {
        res = len * brd;
    }

    class Main {
        public static void main(String... s) {
            Scanner kk = new Scanner(System.in);
            int side = kk.nextInt();
            int len = kk.nextInt();
            int brd = kk.nextInt();
            Area a = new Area(side);
            System.out.println("Area of square is:" + a.res);
            Area a1 = new Area();
            System.out.println("Area of rectangle is:" + a1.res);
        }
    }
}