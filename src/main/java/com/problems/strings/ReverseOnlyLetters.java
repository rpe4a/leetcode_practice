package com.problems.strings;

public class ReverseOnlyLetters {
    static void main() {
//        System.out.println(reverseOnlyLetters("ab-cd"));
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    public static String reverseOnlyLetters(String s) {
        var chars = s.toCharArray();
        var start = 0;
        var end = chars.length - 1;
        while (start < end) {
            var startC = chars[start];
            var endC = chars[end];
            if (Character.isLetter(startC) && Character.isLetter(endC)) {
                var temp = startC;
                chars[start] = endC;
                chars[end] = temp;
                start++;
                end--;
            }
            if (!Character.isLetter(startC)) {
                start++;
            }
            if (!Character.isLetter(endC)) {
                end--;
            }
        }
        return String.valueOf(chars);
    }
}
