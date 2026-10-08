package com.problems.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class FindAllKDistantIndicesInArray {
    static void main() {
        System.out.println(findKDistantIndices(new int[]{3, 4, 9, 1, 3, 9, 5}, 9, 1));
        System.out.println(findKDistantIndices(new int[]{2, 2, 2, 2, 2}, 2, 2));
        System.out.println(findKDistantIndices(new int[]{222, 151, 842, 244, 103, 736, 219, 432, 565, 216, 36, 198, 10, 367, 778, 111, 307, 460, 92, 622, 750, 36, 559, 983, 782, 432, 312, 111, 676, 179, 44, 86, 766, 371, 746, 905, 850, 170, 892, 80, 449, 932, 295, 875, 259, 556, 730, 441, 153, 869}, 153, 19));
    }

    public static List<Integer> findKDistantIndices(final int[] nums, final int key, final int k) {
        final List<Integer> keys = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                keys.add(i);
            }
        }

        var set = new HashSet<Integer>();
        for (int i : keys) {
            for (int j = 0; j < nums.length; j++) {
                if (Math.abs(i - j) <= k) {
                    set.add(j);
                }
            }
        }

        var results = new ArrayList<Integer>(set);

        Collections.sort(results);

        return results;
    }
}
