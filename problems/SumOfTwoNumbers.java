package problems;

import java.util.Arrays;

public class SumOfTwoNumbers {
    public static int[] SumOfTwo(int target, int[] nums) {
        int n = nums.length;
        int[] arr = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        // int[] nums = { 2, 3, 4, };
        // int[] nums = { 3, 3 };
        int[] result = SumOfTwo(9, nums);
        System.out.println(Arrays.toString(result));
    }
}
