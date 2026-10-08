package com.problems.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class FindDistinctDifferenceArray {
    static void main() {
        System.out.println(Arrays.toString(distinctDifferenceArray(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(distinctDifferenceArray(new int[]{3, 2, 3, 4, 2})));
    }

    public static int[] distinctDifferenceArray(int[] nums) {
        var results = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            var prefix = getCountUniqueNumbers(0, i, nums);
            var suffix = getCountUniqueNumbers(i + 1, nums.length - 1, nums);
            results[i] = prefix - suffix;
        }

        return results;
    }

    private static int getCountUniqueNumbers(final int from, final int to, final int[] nums) {
        var set = new HashSet<Integer>();
        for (int i = from; i <= to; i++) {
            set.add(nums[i]);
        }
        return set.size();
    }
}
