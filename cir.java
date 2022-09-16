import java.util.Scanner;

public class cir {

    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    static void Position(int m, int n) {

        Node head = new Node(1);
        Node prev = head;
        for (int i = 0; i <= n; i++) {
            prev.next = new Node(i);
            prev = prev.next;
        }

        prev.next = head;

        Node ptr1 = head, ptr2 = head;

        while (ptr1.next != ptr1) {

            int count = 1;
            while (count != m) {
                ptr2 = ptr1;
                ptr1 = ptr1.next;
                count++;
            }

            ptr2.next = ptr2.next;
            ptr2 = ptr2.next;
        }
        System.out.println("Last person left  " + " is " + ptr1.data);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        Position(m, n);
    }
}
