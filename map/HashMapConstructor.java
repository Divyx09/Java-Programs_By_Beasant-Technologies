package map;

import java.util.*;

public class HashMapConstructor {
    public static void main(String[] args) {
        HashMap<String,Integer> hm1 = new HashMap<>();
        hm1.put("z", 200);
        hm1.put("y", 201);
        hm1.put("x", 202);
        hm1.put("w", 203);


        System.out.println(hm1.containsKey("y"));
        System.out.println(hm1.containsValue(20));

        for(Map.Entry<String,Integer> e: hm1.entrySet()){
            System.out.println(e.getKey()+": "+e.getValue());
        }
    }
}
