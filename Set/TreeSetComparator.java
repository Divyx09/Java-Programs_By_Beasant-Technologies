package Set;

import java.util.*;

class HelperComparator implements Comparator<String> {
    public int compare(String S1, String S2) {
        String a;
        String b;   

        a = S1;
        b = S2;
        return b.compareTo(a);
    }
}

public class TreeSetComparator {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<String>();
        t.add("x");
        t.add("a");
        t.add("e");
        t.add("u");
        t.add("g");
        System.out.println(t);

        TreeSet<String> t1 = new TreeSet<String>(new HelperComparator());
        t1.add("a");
        t1.add("x");
        t1.add("e");
        t1.add("u");
        t1.add("g");
        System.out.println(t1);
    }
}
