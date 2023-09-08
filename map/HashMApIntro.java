package map;

import java.util.*;

public class HashMApIntro {
    public static void main(String[] args) {
        Map<String,Integer> hm = new HashMap<>();
        hm.put("b",101);
        hm.put("a",102);
        hm.put("c",103);
        hm.put("d",104);

        System.out.println(hm);
        for(Map.Entry<String,Integer> e: hm.entrySet()){
            System.out.println(e);
        }
    
        HashMap<String,Integer> hm1 = new HashMap<>();
        hm1.put("z", 200);
        hm1.put("y", 201);
        hm1.put("x", 202);
        hm1.put("w", 203);

        for(Map.Entry<String,Integer> e: hm1.entrySet()){
            System.out.println(e);
        }

    }
}
