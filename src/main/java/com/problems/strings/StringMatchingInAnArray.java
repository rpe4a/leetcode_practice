package com.problems.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StringMatchingInAnArray {
    static void main() {
//        System.out.println(stringMatching(new String[]{"mass", "as", "hero", "superhero"}));
        System.out.println(stringMatching(new String[]{"leetcoder", "leetcode", "od", "hamlet", "am"}));
    }

    public static List<String> stringMatching(String[] words) {
        var results = new HashSet<String>();

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                var first = words[i];
                var second = words[j];
                if (first.equals(second)) {
                    results.add(words[i]);
                }
                if (first.contains(second)) {
                    results.add(second);
                }
                if (second.contains(first)) {
                    results.add(first);
                }
            }
        }

        return new ArrayList<>(results);
    }
}
