package com.problems.arrays;

import java.util.List;

public class CheckStringIsAcronymWords {
    static void main() {
        System.out.println(isAcronym(List.of("alice", "bob", "charlie"), "abc"));
    }

    public static boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) {
            return false;
        }

        for (int i = 0; i < words.size(); i++) {
            var word = words.get(i);
            var c = s.charAt(i);
            if (c != word.charAt(0)) {
                return false;
            }
        }

        return true;
    }
}
