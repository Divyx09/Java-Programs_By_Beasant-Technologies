package map.sortedmap;

import java.util.*;

public class SortedMapIntro {
    public static void main(String[] args) {
        SortedMap<String,Integer> sm = new TreeMap<>();
        sm.put("A", 12);
        sm.put("X", 12);
        sm.put("C", 12);

        System.out.println(sm);

    }
}
