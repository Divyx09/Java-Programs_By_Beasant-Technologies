package map.sortedmap.treemap;

import java.util.TreeMap;

public class TreeMapIntro {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>();

        tm.put(10, "Z");
        tm.put(7, "F");
        tm.put(4, "B");
        tm.put(3, "A");

        System.out.println(tm);
        
    }
}
