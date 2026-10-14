package com.problems.arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    static void main() {
        System.out.println(hasDuplicate(new int[]{1, 2, 3, 4, 5}));
    }

    public static boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && map.get(nums[i]) == 1) {
                return true;
            } else {
                map.put(nums[i], 1);
            }
        }
        return false;
    }
}
