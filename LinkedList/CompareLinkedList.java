package LinkedList;
import java.util.LinkedList;

public class CompareLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(11);
        ll.add(12);
        ll.add(13);
        ll.add(14);
        System.out.println(ll);

        LinkedList<Integer> ll1 = new LinkedList<Integer>();
        ll1.add(11);
        ll1.add(12);
        ll1.add(1);
        ll1.add(14);
        System.out.println(ll1);

        LinkedList<String> ll2 = new LinkedList<String>();
        for (int a : ll) {
            ll2.add(ll1.contains(a) ? "yes" : "no");
        }
        System.out.println(ll2);

    }
}
