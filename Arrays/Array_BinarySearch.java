package Arrays;
import java.util.Arrays;

public class Array_BinarySearch {
    public static void main(String[] args) {
        int[] arr={12,13,14,15,16,17};
        Arrays.sort(arr);
        int key = 14;
        System.out.println(key+" Found at index "+Arrays.binarySearch(arr,key));

    }
}
