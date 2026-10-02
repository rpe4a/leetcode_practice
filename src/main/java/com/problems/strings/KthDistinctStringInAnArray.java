package com.problems.strings;

import java.util.HashMap;

public class KthDistinctStringInAnArray {
    static void main() {
        System.out.println(kthDistinct(new String[]{"d", "b", "c", "b", "c", "a"}, 2));
        System.out.println(kthDistinct(new String[]{"aaa", "aa", "a"}, 1));
    }

    public static String kthDistinct(String[] arr, int k) {
        var map = new HashMap<String, Integer>();
        for (var i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        for (var i = 0; i < arr.length; i++) {
            var word = arr[i];
            if (map.get(word) == 1 && 1 == k--) {
                return word;
            }
        }

        return "";
    }
}
