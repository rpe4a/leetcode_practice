package com.problems.strings;

public class ExcelSheetColumnTitle {
    static void main() {
        System.out.println(convertToTitle(1)); // A
        System.out.println(convertToTitle(28)); // AB
        System.out.println(convertToTitle(26)); // Z
        System.out.println(convertToTitle(27)); // AA
        System.out.println(convertToTitle(701)); // ZY
        System.out.println(convertToTitle(2147483647)); // FXSHRXW
        System.out.println(convertToTitle(52)); // AZ
    }

    public static String convertToTitle(final int columnNumber) {
        final int A = 65;

        final int letter = columnNumber % 26;
        final String suffix = letter == 0 ? "Z" : Character.toString(A + letter - 1);

        final int rank = columnNumber / 26;
        final String prefix = rank == 0 || letter == 0 ? "" : convertToTitle(rank);

        return prefix + suffix;
    }
}
