package com.problems.arrays;

public class CheckStringIsPrefixArray {
    static void main() {
        System.out.println(isPrefixString("iloveleetcode", new String[]{"i", "love", "leetcode", "apples"}));
        System.out.println(isPrefixString("iloveleetcode", new String[]{"apples", "i", "love", "leetcode"}));
        System.out.println(isPrefixString("ileetcode", new String[]{"i", "love", "leetcode", "apples"}));
    }

    public static boolean isPrefixString(String s, String[] words) {
        if (!s.startsWith(words[0])) {
            return false;
        }

        var index = 0;
        for (int i = 0; i < words.length; i++) {
            var word = words[i];
            if (s.indexOf(word, index) != -1) {
                index += word.length();
            } else {
                return false;
            }

            if (s.length() == index) {
                return true;
            }
        }

        return false;
    }
}
