package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Array_Sort {
    public static void main(String[] args) {
        System.out.println("Insert Value Into arrays");
        Scanner obj = new Scanner(System.in);
        int[] arr = new int[5];
        for(int l=0;l<5;l++){
            arr[l] = obj.nextInt();
        }
        System.out.println("Your Sorted Array List ");
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        obj.close();
    }
}
