package com.problems.arrays;

import java.util.Arrays;

public class TransposeMatrix {

    static void main() {
        System.out.println(Arrays.toString(transpose(new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9}})));
    }

    public static int[][] transpose(int[][] matrix) {
        var result = new int[matrix[0].length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                result[col][row] = matrix[row][col];
            }
        }
        return result;
    }
}
