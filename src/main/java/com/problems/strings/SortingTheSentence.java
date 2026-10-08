package com.problems.strings;

public class SortingTheSentence {
    static void main() {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

    public static String sortSentence(String s) {
        var spaces = 1;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                spaces++;
            }
        }

        var results = new String[spaces];
        var start = 0;
        var end = 0;
        while (end < s.length()) {
            var c = s.charAt(end);

            if (Character.isDigit(c)) {
                results[c - '1'] = s.substring(start, end);
                start = end;
            }

            if (c == ' ') {
                start = start + 2;
                end = end + 2;
            } else {
                end++;
            }

        }

        return String.join(" ", results);
    }
}
