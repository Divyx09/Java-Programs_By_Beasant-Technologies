package map.sortedmap.treemap;

import java.util.*;

public class TreeMapFunc {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = InnerTreeMapFunc.TreeMapInitialize();
        InnerTreeMapFunc.putValue(treeMap);
        InnerTreeMapFunc.printValue(treeMap);
    }
}

class InnerTreeMapFunc {
    static TreeMap<Integer, String> TreeMapInitialize() {
        TreeMap<Integer, String> tm = new TreeMap<>();
        return tm;
    }
    static void putValue(TreeMap<Integer, String> tm1) {
        tm1.put(12, "Y");
        tm1.put(11, "X");
        tm1.put(10, "W");
        tm1.put(13, "Z");
    }
    static void printValue(TreeMap<Integer, String> tm1){
        for (Map.Entry<Integer,String> t : tm1.entrySet()) {
            System.out.println(t.getKey()+":"+t.getValue());
        }
    }
}