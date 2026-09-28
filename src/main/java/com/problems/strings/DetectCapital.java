package com.problems.strings;

public class DetectCapital {
    static void main() {
        System.out.println(detectCapitalUse("Google"));
        System.out.println(detectCapitalUse("FlaG"));
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("leetcode"));
    }

    public static boolean detectCapitalUse(final String word) {
        boolean allCapitals = true;
        boolean allNotCapitals = true;
        boolean othersNotCapitals = true;

        final boolean firstIsCapital = 'A' <= word.charAt(0) && word.charAt(0) <= 'Z';

        for (int i = 0; i < word.length(); i++) {
            final char letter = word.charAt(i);

            if(allCapitals && 'a' <= letter && letter <= 'z') {
                allCapitals = false;
            }

            if(allNotCapitals && 'A' <= letter && letter <= 'Z') {
                allNotCapitals = false;
            }

            if(firstIsCapital && i > 0 && othersNotCapitals && 'A' <= letter && letter <= 'Z') {
                othersNotCapitals = false;
            }
        }

        return allCapitals || allNotCapitals || (firstIsCapital && othersNotCapitals);
    }
}
