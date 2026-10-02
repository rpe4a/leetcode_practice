package com.problems.strings;

public class CheckIfAllAppearsBeforeAll {
    static void main() {
        System.out.println(checkString("aaabbb"));
        System.out.println(checkString("abab"));
        System.out.println(checkString("bbb"));
        System.out.println(checkString("aaba"));
        System.out.println(checkString("aaa"));
        System.out.println(checkString("aaaabb"));
    }

    public static boolean checkString(String s) {
        var i = 0;
        var before = Integer.MIN_VALUE;
        var after = Integer.MAX_VALUE;
        while (i < s.length()) {
            if (s.charAt(i) == 'a') {
                before = i;
            }
            if (s.charAt(i) == 'b') {
                after = i;
            }

            if (before > after) {
                return false;
            }

            i++;
        }

        return true;
    }
}
