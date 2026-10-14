package com.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LimitOccurrencesSortedArray {
    static void main() {
        System.out.println(Arrays.toString(limitOccurrences(new int[]{1, 1, 1, 2, 2, 3}, 2)));
        System.out.println(Arrays.toString(limitOccurrences(new int[]{1, 2, 3}, 1)));
    }

    public static int[] limitOccurrences(int[] nums, int k) {
        var map = new int[101];
        var list = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            map[nums[i]]++;

            if (map[nums[i]] <= k) {
                list.add(nums[i]);
            }
        }

        var result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

//        return Arrays.copyOf(list, result.length);
        return null;
    }

}
