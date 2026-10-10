package com.problems.arrays;

public class NumberArithmeticTriplets {

    static void main() {
        System.out.println(arithmeticTriplets(new int[]{0, 1, 4, 6, 7, 10}, 3));
        System.out.println(arithmeticTriplets(new int[]{4, 5, 6, 7, 8, 9}, 2));
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        var triplet = 0;
        for (int i = 0; i < nums.length; i++) {
            var found = 0;
            var index = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[index] - nums[j]) == diff) {
                    index = j;
                    found++;
                }

                if (found > 1) {
                    break;
                }
            }
            if (found > 1) {
                triplet++;
            }
        }

        return triplet;
    }
}
