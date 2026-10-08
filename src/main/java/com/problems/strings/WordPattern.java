package com.problems.strings;

import java.util.HashSet;

public class WordPattern {
    static void main() {
//        System.out.println(wordPattern("abba", "dog cat cat dog"));
//        System.out.println(wordPattern("abba", "dog cat cat fish"));
//        System.out.println(wordPattern("abba", "dog dog dog dog"));
        System.out.println(wordPattern("aba", "cat cat cat dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        var map = new String[26];
        var words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        var cSet = new HashSet<Character>();
        for (char c : pattern.toCharArray()) {
            cSet.add(c);
        }

        var wSet = new HashSet<String>();
        for (String str : words) {
            wSet.add(str);
        }

        if (cSet.size() != wSet.size()) {
            return false;
        }

        for (int i = 0; i < words.length; i++) {
            var c = pattern.charAt(i);
            var word = words[i];
            if (map[c - 'a'] == null) {
                map[c - 'a'] = word;
            }
        }

        for (var i = 0; i < pattern.length(); i++) {
            var c = pattern.charAt(i);
            var word = words[i];
            if (!map[c - 'a'].equals(word)) {
                return false;
            }
        }

        return true;
    }
}
