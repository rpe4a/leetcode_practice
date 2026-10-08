package com.problems.strings;

public class MaximumOddBinaryNumber {
    static void main() {
        System.out.println(maximumOddBinaryNumber("010"));
        System.out.println(maximumOddBinaryNumber("0101"));
    }

    public static String maximumOddBinaryNumber(String s) {
        var zeros = 0;
        var odds = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                zeros++;
            }
            if (c == '1') {
                odds++;
            }
        }

        var sb = new StringBuilder();
        for (int i = 0; i < odds - 1; i++) {
            sb.append("1");
        }

        for (int i = 0; i < zeros; i++) {
            sb.append("0");
        }

        sb.append("1");
        return sb.toString();
    }
}
