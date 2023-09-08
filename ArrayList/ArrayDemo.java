package ArrayList;

import java.util.*;

public interface ArrayDemo {
    public static void main(String[] args) {
        
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(123);
        arr.add(125);
        arr.add(128);
        arr.add(127);
        
        boolean a = arr.contains(128);
        System.out.println(a);

}
}
