package com.problems.strings;

public class ValidPalindrome {
    static void main() {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(""));
    }

    public static boolean isPalindrome(final String s) {
        final String sLowerCase = s.toLowerCase();
        final String sLowerCaseAlphaNumeric = sLowerCase.replaceAll("[^a-zA-Z0-9]", "");

        if (sLowerCaseAlphaNumeric.isEmpty()) {
            return true;
        }

        int i = 0;
        int j = sLowerCaseAlphaNumeric.length() - 1;
        while (i < j) {
            if (sLowerCaseAlphaNumeric.charAt(i) != sLowerCaseAlphaNumeric.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
