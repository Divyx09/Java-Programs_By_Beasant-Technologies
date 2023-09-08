package Set;

import java.util.SortedSet;
import java.util.TreeSet;   

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String> ss = new TreeSet<String>();
        ss.add("D");
        ss.add("B");
        ss.add("C");
        ss.add("E");
        ss.add("A");
        System.out.println("SortedSet: "+ss);
        
        SortedSet<Integer> s1s = new TreeSet<Integer>();
        s1s.add(45);
        s1s.add(26);
        s1s.add(49);
        s1s.add(72);
        s1s.add(5);
        System.out.println("SortedSet: "+s1s);
    }
}
