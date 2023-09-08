package Set;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set =new HashSet<Integer>();
        
        set.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7}));
        System.out.println(set);
        Set<Integer> set2 =new HashSet<Integer>();
        set2.addAll(Arrays.asList(new Integer[] {11,2,4,13,15,16,6}));
        System.out.println(set2);
        
        Set<Integer> union =new HashSet<Integer>(set);
        union.addAll(set2);
        System.out.println("Union: "+union);
        
        
        Set<Integer> inte =new HashSet<Integer>(set);
        inte.retainAll(set2);
        System.out.println("Intersection: "+inte);
        
        
        Set<Integer> Diff =new HashSet<Integer>(set);
        Diff.removeAll(set2);
        System.out.println("Difference: "+Diff);

        
    }
}
