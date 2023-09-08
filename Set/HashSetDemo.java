package Set;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<ArrayList> hashSet = new HashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList2.add(14);
        arrayList2.add(15);
        arrayList2.add(16);
        hashSet.add(arrayList);
        hashSet.add(arrayList2);

        System.out.println(hashSet);

        

    }
}
