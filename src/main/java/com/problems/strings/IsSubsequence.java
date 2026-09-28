package com.problems.strings;

public class IsSubsequence {
    static void main() {
//        System.out.println(isSubsequence("abc", "ahbgdc"));
//        System.out.println(isSubsequence("axc", "ahbgdc"));
//        System.out.println(isSubsequence("acb", "ahbgdc"));
        System.out.println(isSubsequence("", "ahbgdc"));
    }

    public static boolean isSubsequence(final String s, final String t) {
        if (s.isEmpty()) {
            return true;
        }

        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            final char s1 = s.charAt(j);
            final char t1 = t.charAt(i);

            if (s1 == t1) {
                j++;

                if (s.length() == j) {
                    return true;
                }
            }

        }

        return false;
    }
}
