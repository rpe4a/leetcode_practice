package com.problems.strings;

public class MaximumScoreAfterSplittingString {
    static void main() {
        System.out.println(maxScore("011101"));
        System.out.println(maxScore("00111"));
        System.out.println(maxScore("1111"));
        System.out.println(maxScore("00"));
    }

    public static int maxScore(String s) {
        var oneCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                oneCount++;
            }
        }

        var zeroCount = 0;
        var maxScore = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zeroCount++;
            }
            if (s.charAt(i) == '1') {
                oneCount--;
            }

            maxScore = Math.max(maxScore, zeroCount + oneCount);
        }

        return maxScore;
    }

}
