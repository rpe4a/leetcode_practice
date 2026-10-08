package com.problems.arrays;

import java.util.Arrays;

public class RelativeSortArray {
    static void main() {
        System.out.println(Arrays.toString(relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6})));
    }                                                                                                             //0  1  2  3  4  5

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        var map = new int[1001];
        for (int i = 0; i < arr1.length; i++) {
            map[arr1[i]]++;
        }

        var result = new int[arr1.length];

        var index = 0;
        for (int i = 0; i < arr2.length; i++) {
            while (map[arr2[i]] > 0) {
                result[index++] = arr2[i];
                map[arr2[i]]--;
            }
        }

        for (int i = 0; i < map.length; i++) {
            while (map[i] > 0) {
                result[index++] = i;
                map[i]--;
            }
        }

        return result;
    }
}
