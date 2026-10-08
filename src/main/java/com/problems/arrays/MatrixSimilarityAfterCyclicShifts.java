package com.problems.arrays;

import java.util.Arrays;

public class MatrixSimilarityAfterCyclicShifts {

    static void main() {
        System.out.println(areSimilar(new int[][]{new int[]{1, 2, 3}}, 4));
        System.out.println(areSimilar(new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9}}, 4));
        System.out.println(areSimilar(new int[][]{new int[]{1, 2, 1, 2}, new int[]{5, 5, 5, 5}, new int[]{6, 3, 6, 3}}, 2));
    }

    public static boolean areSimilar(int[][] mat, int k) {
        var arr = new int[mat.length][];
        for (int i = 0; i < mat.length; i++) {
            arr[i] = Arrays.copyOf(mat[i], mat[i].length);
        }

        k %= arr[0].length;

        while (k != 0) {
            for (int i = 0; i < mat.length; i++) {
                shift(mat[i], i);
            }
            k--;
        }

        return Arrays.deepEquals(arr, mat);
    }

    private static void shift(final int[] arr, final int i) {
        if (i % 2 == 0) {
            leftShift(arr);
        } else {
            rightShift(arr);
        }
    }

    private static void rightShift(final int[] arr) {
        swap(arr, 0, arr.length - 1);
        for (int i = arr.length - 1; i > 1; i--) {
            swap(arr, i, i - 1);
        }
    }

    private static void leftShift(final int[] arr) {
        swap(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length - 2; i++) {
            swap(arr, i, i + 1);
        }
    }

    private static void swap(final int[] arr, final int i, final int j) {
        final int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
