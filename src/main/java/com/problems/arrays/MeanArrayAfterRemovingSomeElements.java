package com.problems.arrays;

import java.util.Arrays;

public class MeanArrayAfterRemovingSomeElements {
    static void main() {
        System.out.println(trimMean(new int[]{1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}));
        System.out.println(trimMean(new int[]{6, 2, 7, 5, 1, 2, 0, 3, 10, 2, 5, 0, 5, 5, 0, 8, 7, 6, 8, 0}));
        System.out.println(trimMean(new int[]{6, 0, 7, 0, 7, 5, 7, 8, 3, 4, 0, 7, 8, 1, 6, 8, 1, 1, 2, 4, 8, 1, 9, 5, 4, 3, 8, 5, 10, 8, 6, 6, 1, 0, 6, 10, 8, 2, 3, 4}));
    }

    public static double trimMean(int[] arr) {
        Arrays.sort(arr);

        int l = arr.length;
        int fivePercentages = (int) Math.round(l * 0.05);
        int sum = 0;
        for (int i = fivePercentages; i < l - fivePercentages; i++) {
            sum += arr[i];
        }

        return (double) sum / (l - fivePercentages * 2);
    }
}
