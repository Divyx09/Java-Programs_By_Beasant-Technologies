package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConvertLLtoAL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(11);
        ll.add(12);
        ll.add(13);
        ll.add(14);
        System.out.println(ll);

        List<Integer> arr = new ArrayList<Integer>(ll);
        System.out.println(arr);
    }
}
