package map;

import java.util.*;

public class LinkedHashMapIntro {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("Z", 101);
        lhm.put("Y", 102);
        lhm.put("X", 103);
        lhm.put("W", 104);

        System.out.println(lhm.get("Y"));
        System.out.println(lhm.size());
        System.out.println(lhm.isEmpty());
        System.out.println(lhm.remove("Y"));
        System.out.println(lhm.put("Z", 201));
        

        for (Map.Entry<String, Integer> e : lhm.entrySet()) {
            System.out.println(e);
        }

    }
}
