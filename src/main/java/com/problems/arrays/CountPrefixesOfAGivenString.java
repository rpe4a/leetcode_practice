package com.problems.arrays;

public class CountPrefixesOfAGivenString {
    static void main() {
        System.out.println(countPrefixes(new String[]{"a", "b", "c", "ab", "bc", "abc"}, "abc"));
        System.out.println(countPrefixes(new String[]{"a", "a"}, "aa"));
    }

    public static int countPrefixes(String[] words, String s) {
        var count = 0;
        for (String str : words) {
            if (s.startsWith(str)) {
                count++;
            }
        }
        return count;
    }
}
