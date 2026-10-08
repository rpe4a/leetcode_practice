package com.problems.arrays;

public class MaximumNumberOperationsWithSameScoreI {
    static void main() {
        System.out.println(maxOperations(new int[]{2, 2, 3, 2, 4, 2, 3, 3, 1, 3}));
        System.out.println(maxOperations(new int[]{3, 2, 1, 4, 5}));
        System.out.println(maxOperations(new int[]{1, 5, 3, 3, 4, 1, 3, 2, 2, 3}));
        System.out.println(maxOperations(new int[]{5, 3}));
    }

    public static int maxOperations(int[] nums) {
        var max = 0;
        var sum = nums[0] + nums[1];
        for (int i = 0, j = 1; j <= nums.length - 1; i = i + 2, j = j + 2) {
            if (nums[i] + nums[j] != sum) {
                break;
            }
            max++;
        }

        return max;
    }
}
