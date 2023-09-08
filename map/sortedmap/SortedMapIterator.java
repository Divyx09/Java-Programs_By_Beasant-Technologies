package map.sortedmap;
import java.util.*;
public class SortedMapIterator {
    public static void main(String[] args) {
        SortedMap<Integer,String> sm = new TreeMap<>();
        sm.put(13, "o");
        sm.put(12, "L");
        sm.put(16, "E");
        sm.put(15, "V");

        Set entry = sm.entrySet();
        Iterator run = entry.iterator();
        while (run.hasNext()) {
            Map.Entry<Integer,String> e = (Map.Entry)run.next();    
            System.out.println(e.getKey()+": "+e.getValue());
        }
    }
}
