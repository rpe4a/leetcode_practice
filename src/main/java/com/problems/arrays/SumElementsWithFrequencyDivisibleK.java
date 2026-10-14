package com.problems.arrays;

public class SumElementsWithFrequencyDivisibleK {
    static void main() {
        System.out.println(sumDivisibleByK(new int[]{1, 2, 2, 3, 3, 3, 3, 4}, 2));
        System.out.println(sumDivisibleByK(new int[]{1, 2, 3, 4, 5}, 2));
        System.out.println(sumDivisibleByK(new int[]{4, 4, 4, 1, 2, 3}, 3));
        System.out.println(sumDivisibleByK(new int[]{4, 4, 10, 4}, 2));
    }

    public static int sumDivisibleByK(int[] nums, int k) {
        var map = new int[101];
        for (int i = 0; i < nums.length; i++) {
            map[nums[i]]++;
        }

        var res = 0;
        for (int i = 0; i < map.length; i++) {
            if (map[i] >= k) {
                if (map[i] / k > 0 && map[i] % k == 0) {
                    res += map[i] * i;
                }
            }
        }

        return res;
    }
}

