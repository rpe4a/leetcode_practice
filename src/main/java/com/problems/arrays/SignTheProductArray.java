package com.problems.arrays;

public class SignTheProductArray {
    static void main() {
        System.out.println(arraySign(new int[]{-1, -2, -3, -4, 3, 2, 1}));
        System.out.println(arraySign(new int[]{1, 5, 0, 2, -3}));
        System.out.println(arraySign(new int[]{-1, 1, -1, 1, -1}));
    }

    public static int arraySign(int[] nums) {
        var sign = 1;
        for (var i = 0; i < nums.length; i++) {
            var num = signFunc(nums[i]);
            if (num == 0) {
                return 0;
            }
            sign *= num;
        }

        return sign;
    }

    public static int signFunc(int number) {
        if (number == 0) {
            return 0;
        }
        if (number < 0) {
            return -1;
        }
        return 1;
    }
}
