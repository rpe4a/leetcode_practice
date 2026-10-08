package com.problems.strings;

import java.util.Arrays;

public class OddStringDifference {
    static void main() {
        System.out.println(oddString(new String[]{"adc", "wzy", "abc"}));
        System.out.println(oddString(new String[]{"aaa", "bob", "ccc", "ddd"}));
        System.out.println(oddString(new String[]{"ddd", "poo", "baa", "onn"}));
        System.out.println(oddString(new String[]{"mll", "edd", "jii", "tss", "fee", "dcc", "nmm", "abb", "utt", "zyy", "xww", "tss", "wvv", "xww", "utt"}));
    }

    public static String oddString(String[] words) {
        var result = new int[words.length][];
        for (int i = 0; i < words.length; i++) {
            result[i] = new int[words[i].length() - 1];
            for (int j = 0; j < words[i].length() - 1; j++) {
                result[i][j] = words[i].charAt(j + 1) - words[i].charAt(j);
            }
        }

        var start = 0;
        var end = 1;
        while (end < result.length) {
            var arr1 = result[start];
            var arr2 = result[end];
            if (!Arrays.equals(arr1, arr2)) {
                break;
            }
            start++;
            end++;
        }

        var startCount = 0;
        for (int i = 0; i < result.length; i++) {
            if (Arrays.equals(result[i], result[start])) {
                startCount++;
            }
        }

        return startCount == 1 ? words[start] : words[end];
    }
}
