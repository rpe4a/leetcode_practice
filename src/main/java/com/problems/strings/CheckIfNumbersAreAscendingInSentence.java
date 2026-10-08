package com.problems.strings;

public class CheckIfNumbersAreAscendingInSentence {
    static void main() {
        System.out.println(areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles"));
        System.out.println(areNumbersAscending("hello world 5 x 5"));
        System.out.println(areNumbersAscending("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"));
    }

    public static boolean areNumbersAscending(String s) {
        var prev = "0";
        var current = "";
        var i = 0;
        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                var j = i + 1;
                while (j < s.length() && Character.isDigit(s.charAt(j))) {
                    j++;
                }
                current = s.substring(i, j);
                if (Integer.parseInt(prev) >= Integer.parseInt(current)) {
                    return false;
                }
                prev = current;
                i = j;
            } else {
                i++;
            }
        }

        return true;
    }
}
