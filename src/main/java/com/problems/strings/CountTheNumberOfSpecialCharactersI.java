package com.problems.strings;

public class CountTheNumberOfSpecialCharactersI {

    static void main() {
        System.out.println(numberOfSpecialChars("aaAbcBC"));
    }

    public static int numberOfSpecialChars(final String word) {
        final int[] uniqueLowerCaseChars = new int[26];
        final int[] uniqueUpperCaseChars = new int[26];

        for (final char c : word.toCharArray()) {
            if (Character.isLowerCase(c) && uniqueLowerCaseChars[c - 'a'] == 0) {
                uniqueLowerCaseChars[c - 'a'] = 1;
            }
            if (Character.isUpperCase(c) && uniqueUpperCaseChars[c - 'A'] == 0) {
                uniqueUpperCaseChars[c - 'A'] = 1;
            }
        }

        int number = 0;
        for (int i = 0; i < uniqueLowerCaseChars.length; i++) {
            if (uniqueLowerCaseChars[i] == 1 && uniqueUpperCaseChars[i] == 1) {
                number++;
            }
        }

        return number;
    }
}
