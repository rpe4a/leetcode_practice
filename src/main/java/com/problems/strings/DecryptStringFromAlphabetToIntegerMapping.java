package com.problems.strings;

public class DecryptStringFromAlphabetToIntegerMapping {
    static void main() {
        System.out.println(freqAlphabets("10#11#12"));
        System.out.println(freqAlphabets("1326#"));
    }

    public static String freqAlphabets(final String s) {
        final StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            final char c = s.charAt(i);
            int digit = 0;
            if (c == '#') {
                digit = Integer.parseInt(s.substring(i - 2, i));
                i = i - 3;
            } else {
                digit = Integer.parseInt(String.valueOf(c));
                i--;
            }
            sb.append((char) ('a' + (digit - 1)));
        }

        return sb.reverse().toString();
    }
}
