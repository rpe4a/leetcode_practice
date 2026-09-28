package com.problems.strings;

public class AddStrings {
    static void main() {
        System.out.println(addStrings("11", "123"));
        System.out.println(addStrings("456", "77"));
        System.out.println(addStrings("0", "0"));
        System.out.println(addStrings("1", "9"));
    }

    public static String addStrings(final String num1, final String num2) {
        final String shortNumber = num1.length() > num2.length() ? num2 : num1;
        final String longNumber = num1.length() > num2.length() ? num1 : num2;

        int rank = 0;
        final StringBuilder result = new StringBuilder();
        for (int i = longNumber.length() - 1, j = shortNumber.length() - 1; i >= 0; i--, j--) {
            final String digitL = String.valueOf(longNumber.charAt(i));
            final String digitS = j < 0 ? "0" : String.valueOf(shortNumber.charAt(j));

            final int sum = Integer.parseInt(digitL) + Integer.parseInt(digitS) + rank;
            rank = sum / 10;
            result.append(sum % 10);
        }

        if (rank != 0) {
            result.append(rank);
        }

        return result.reverse().toString();
    }
}
