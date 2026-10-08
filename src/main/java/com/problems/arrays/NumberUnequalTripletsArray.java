package com.problems.arrays;

public class NumberUnequalTripletsArray {
    static void main() {
        System.out.println(unequalTriplets(new int[]{4, 4, 2, 4, 3}));
    }

    public static int unequalTriplets(int[] nums) {
        var triplets = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] != nums[j] && nums[i] != nums[k] && nums[j] != nums[k]) {
                        triplets++;
                    }
                }
            }
        }

        return triplets;
    }
}
