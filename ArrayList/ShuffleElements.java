package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleElements {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("deep");
        arr.add("hello");
        arr.add("apple");
        arr.add("play");
        arr.add("rough");
        Collections.sort(arr);
        System.out.println(arr);
        Collections.shuffle(arr);
        System.out.println(arr);
        
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(10);
        arr1.add(2);
        arr1.add(11);
        arr1.add(16);
        arr1.add(1);
        Collections.sort(arr1);
        System.out.println(arr1);
        Collections.shuffle(arr1);
        System.out.println(arr1);
    }
}
