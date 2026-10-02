package com.problems.strings;

public class MaximumScoreAfterSplittingString {
    static void main() {
        System.out.println(maxScore("011101"));
        System.out.println(maxScore("00111"));
        System.out.println(maxScore("1111"));
    }

    public static int maxScore(String s) {
        var max = Integer.MIN_VALUE;
        for (int i = 1; i < s.length(); i++) {
            var leftScore = getLeftScore(s, i);
            var rightScore = getRightScore(s, i);
            max = Math.max(leftScore + rightScore, max);
        }
        return max;
    }

    private static int getLeftScore(final String s, final int leftIndex) {
        var score = 0;
        for (var i = 0; i < leftIndex; i++) {
            if (s.charAt(i) == '0') {
                score++;
            }
        }
        return score;
    }

    private static int getRightScore(final String s, final int rightIndex) {
        var score = 0;
        for (var i = rightIndex; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                score++;
            }
        }

        return score;
    }

}
