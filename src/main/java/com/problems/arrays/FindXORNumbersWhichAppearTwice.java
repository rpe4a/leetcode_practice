package com.problems.arrays;

import java.util.ArrayList;

public class FindXORNumbersWhichAppearTwice {
    static void main() {
        System.out.println(duplicateNumbersXOR(new int[]{1, 2, 1, 3}));
        System.out.println(duplicateNumbersXOR(new int[]{1, 2, 3}));
        System.out.println(duplicateNumbersXOR(new int[]{1, 2, 2, 1}));
    }

    public static int duplicateNumbersXOR(int[] nums) {
        var map = new int[50];
        for (int i = 0; i < nums.length; i++) {
            map[nums[i]]++;
        }

        var results = new ArrayList<Integer>();
        for (int i = 0; i < map.length; i++) {
            if (map[i] > 1) {
                results.add(i);
            }
        }

        if (results.isEmpty()) {
            return 0;
        }
        if (results.size() == 1) {
            return results.getFirst();
        }

        var xor = results.get(0);
        for (int i = 1; i < results.size(); i++) {
            xor ^= results.get(i);
        }

        return xor;
    }
}
