package com.problems.arrays;

import java.util.Arrays;

public class AbsoluteDifferenceBetweenMaximumandMinimumKElements {
    static void main() {
        System.out.println(absDifference(new int[]{5, 2, 2, 4}, 2));
        System.out.println(absDifference(new int[]{100}, 1));
        System.out.println(absDifference(new int[]{1, 2}, 2));
        System.out.println(absDifference(new int[]{1, 1}, 1));
    }

    public static int absDifference(int[] nums, int k) {
        if (nums.length <= 1) {
            return 0;
        }

        Arrays.sort(nums);

        var smallest = 0;
        var largest = 0;
        for (int i = 0; i < k; i++) {
            smallest += nums[i];
            largest += nums[nums.length - i - 1];
        }

        return Math.abs(largest - smallest);
    }
}
