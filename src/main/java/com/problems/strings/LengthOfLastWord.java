package com.problems.strings;

public class LengthOfLastWord {
    static void main() {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(final String s) {
        final String sRemoveSpaces = s.trim();
        for (int i = sRemoveSpaces.length() - 1; i >= 0; i--) {
            if (sRemoveSpaces.charAt(i) == ' ') {
                return sRemoveSpaces.length() - i - 1;
            }
        }

        return sRemoveSpaces.length();
    }
}
