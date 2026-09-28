package com.problems.strings;

public class FirstUniqueCharacterString {
    static void main() {
        System.out.println(firstUniqChar("leetcode"));
    }

    public static int firstUniqChar(final String s) {
        final int[] results = new int[26];

        for (int i = 0; i < s.length(); i++) {
            final char character = s.charAt(i);
            results[character - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            final char character = s.charAt(i);
            if (results[character - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
