package com.problems.arrays;

public class SmallestIndexWithDigitSumEqualtoIndex {
    static void main() {
        System.out.println(smallestIndex(new int[]{1, 3, 2}));
        System.out.println(smallestIndex(new int[]{1, 10, 11}));
        System.out.println(smallestIndex(new int[]{1, 2, 3}));
    }

    public static int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            var sum = 0;
            var number = nums[i];

            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }

            if (sum == i) {
                return i;
            }
        }
        return -1;
    }
}
