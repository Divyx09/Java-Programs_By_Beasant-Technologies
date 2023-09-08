package Set;

import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(11);
        lhs.add(14);
        lhs.add(12);
        lhs.add(14);
        System.out.println("set "+ lhs);

        lhs.remove(14);
        int d=lhs.size();
        System.out.println(d);
        
        LinkedHashSet<Integer> hs =new LinkedHashSet<>();
        hs.addAll(Arrays.asList(new Integer[]{12,15,18,19,16}));
        System.out.println(hs);
    }
}
