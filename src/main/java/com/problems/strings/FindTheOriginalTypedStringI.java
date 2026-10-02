package com.problems.strings;

public class FindTheOriginalTypedStringI {
    static void main() {
        System.out.println(possibleStringCount("abbcccc"));
        System.out.println(possibleStringCount("abcd"));
    }

    public static int possibleStringCount(String word) {
        var sum = 1;
        var prevCharacter = Character.MIN_VALUE;
        for (char c : word.toCharArray()) {
            if (c == prevCharacter) {
                sum++;
            } else {
                prevCharacter = c;
            }
        }

        return sum;
    }
}
