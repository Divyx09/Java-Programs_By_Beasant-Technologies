package LinkedList;

import java.util.*;

public class LinkedListDemo {
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
        
        LinkedList<String> ll2=new LinkedList<>(ll);
        ll2.add("H");
        ll2.add("I");
        ll2.add("J");
        ll2.add("K");
        ll2.add("L");
        System.out.println(ll2);
        
        
        // ll.set(0, "replaced");
        // System.out.println(ll);
        
        Iterator<String> obj = ll2.iterator();
        while(obj.hasNext()){
            System.out.print(obj.next()+" ");
        }

    }
}
