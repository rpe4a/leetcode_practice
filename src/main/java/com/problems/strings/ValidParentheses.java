package com.problems.strings;

import java.util.Stack;

public class ValidParentheses {

    static void main() {
        System.out.println(isValid("(])"));
    }

    public static boolean isValid(final String s) {
        final Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            final char bracket = s.charAt(i);

            if (stack.isEmpty() && ("]})".contains(String.valueOf(bracket)))) {
                return false;
            } else if ("([{".contains(String.valueOf(bracket))) {
                stack.push(bracket);
            } else if (stack.peek() == '(' && bracket == ')') {
                stack.pop();
            } else if (stack.peek() == '{' && bracket == '}') {
                stack.pop();
            } else if (stack.peek() == '[' && bracket == ']') {
                stack.pop();
            } else if ("]})".contains(String.valueOf(bracket))) {
                return  false;
            }
        }

        return stack.isEmpty();
    }
}

