package com.problems.strings;

public class TruncateSentence {
    static void main() {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
        System.out.println(truncateSentence("chopper is not a tanuki", 5));
    }

    public static String truncateSentence(String s, int k) {
        var sb = new StringBuilder();
        var index = 0;
        while (index < s.length()) {
            if (s.charAt(index) == ' ') {
                k--;
            }

            if (k == 0) {
                break;
            }

            sb.append(s.charAt(index));
            index++;
        }

        return sb.toString();
    }
}
