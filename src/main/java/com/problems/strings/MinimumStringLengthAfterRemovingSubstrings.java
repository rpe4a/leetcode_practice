package com.problems.strings;

import java.util.ArrayDeque;

public class MinimumStringLengthAfterRemovingSubstrings {
    static void main() {
        System.out.println(minLength("ABFCACDB"));
        System.out.println(minLength("CCCCDDDD"));
        System.out.println(minLength("ACBBD"));
    }

    public static int minLength(String s) {
        var stack = new ArrayDeque<Character>();
        for (var i = 0; i < s.length(); i++) {
            var ch = s.charAt(i);

            if (!stack.isEmpty() && ch == 'B' && stack.peek() == 'A') {
                stack.pop();
            } else if (!stack.isEmpty() && ch == 'D' && stack.peek() == 'C') {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.size();
    }
}
