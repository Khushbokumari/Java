
import java.util.*;

class GFG {
    static int prime[] = new int[100001];

    static void Concat() {
        for (int i = 0; i < 100001; i++)
            prime[i] = 1;

        int p = 2;
        while (p * p <= 100000) {

            if (prime[p] == 1) {

                for (int i = p * p; i < 100001; i += p)
                    prime[i] = 0;
            }
            p += 1;
        }
    }

    static int join(int a, int b) {
        int mul = 1;
        int bb = b;

        while (b != 0) {
            mul *= 10;
            b /= 10;
        }
        a *= mul;
        a += bb;
        return a;
    }

    static void Prime(int n1, int n2) {
        Concat();

        Vector<Integer> initial = new Vector<>();

        for (int i = n1; i <= n2; i++)
            if (prime[i] == 1)
                initial.add(i);

        Vector<Integer> now = new Vector<>();

        for (int i = 0; i < initial.size(); i++) {
            for (int j = 0; j < initial.size(); j++) {
                int a = (int) initial.get(i);
                int b = (int) initial.get(j);

                if (a != b) {
                    int c = join(a, b);
                    now.add(c);
                }
            }
        }

        Vector<Integer> current = new Vector<>();

        for (int i = 0; i < now.size(); i++)
            if (prime[(int) now.get(i)] == 1)
                current.add((int) now.get(i));

        int cnt[] = new int[1000009];
        for (int i = 0; i < 1000001; i++)
            cnt[i] = 0;

        Vector<Integer> current_set = new Vector<>();
        for (int i = 0; i < current.size(); i++) {
            cnt[(int) current.get(i)]++;
            if (cnt[(int) current.get(i)] == 1)
                current_set.add((int) current.get(i));
        }

        long first = 1000000000;
        for (int i = 0; i < current_set.size(); i++)
            first = Math.min(first, (int) current_set.get(i));

        long second = 0;
        for (int i = 0; i < current_set.size(); i++)
            second = Math.max(second, (int) current_set.get(i));

        int count = current_set.size() - 1;
        long curr = 1;
        long c = 0;

        while (curr < count) {
            c = first + second;
            first = second;
            second = c;
            curr += 1;
        }

        System.out.println(c);
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 40;

        Prime(x, y);
    }
}
