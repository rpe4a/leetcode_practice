package com.problems.strings;

public class EqualScoreSubstrings {
    static void main() {
        System.out.println(scoreBalance("adcb"));
        System.out.println(scoreBalance("bace"));
        System.out.println(scoreBalance("kl"));
    }

    public static boolean scoreBalance(final String s) {
        int score = 0;
        for (int i = 0; i < s.length(); i++) {
            score = score + (s.charAt(i) - 'a' + 1);
        }

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum + ((s.charAt(i) - 'a') + 1);
            if (score == sum * 2) {
                return true;
            }
        }

        return false;
    }
}
