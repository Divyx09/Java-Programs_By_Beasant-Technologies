package LinkedList;

import java.util.LinkedList;

public class RetrieveLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add(0, "A");
        ll.add(1, "B");
        ll.add(2, "C");
        ll.add(3, "D");
        ll.add(4, "E");
        ll.add(5, "F");
        ll.add(6, "G");
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll);
    }
}
