package com.problems.strings;

import java.util.ArrayList;
import java.util.HashSet;

public class BuddyStrings {
    static void main() {
        System.out.println(buddyStrings("ab", "ba"));
        System.out.println(buddyStrings("aa", "aa"));
        System.out.println(buddyStrings("ab", "ab"));
        System.out.println(buddyStrings("aaaaaaabc", "aaaaaaacb"));
        System.out.println(buddyStrings("abcaa", "abcbb"));
        System.out.println(buddyStrings("abab", "abab"));
    }

    public static boolean buddyStrings(final String s, final String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        final HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
            set.add(goal.charAt(i));
        }

        if (set.size() == 1) {
            return true;
        }

        final int[] results = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            final char cs = s.charAt(i);
            final char cg = goal.charAt(i);

            if (cs != cg) {
                results[i] = 1;
            }
        }

//      [0, 1, 1, 0, 0]
        final ArrayList<Integer> pair = new ArrayList<Integer>();
        for (int i = 0; i < results.length; i++) {
            if (results[i] == 1) {
                pair.add(i);
            }
        }

        if (pair.size() == 2) {
            final int l = pair.get(0);
            final int r = pair.get(1);
            var word = swap(s.toCharArray(), l, r);
            return word.equals(goal);
        }

        return false;
    }

    private static String swap(final char[] cs, final int i, final int j) {
        final char tmp = cs[i];
        cs[i] = cs[j];
        cs[j] = tmp;
        return String.valueOf(cs);
    }
}
