package com.problems.strings;

public class ReversePrefixOfWord {
    static void main() {
        System.out.println(reversePrefix("abcdefd", 'd'));
        System.out.println(reversePrefix("abcd", 'z'));
        System.out.println(reversePrefix("xyxzxe", 'z'));
    }

    public static String reversePrefix(String word, char ch) {
        int reversedIndex = 0;
        while (reversedIndex < word.length()) {
            if (word.charAt(reversedIndex) == ch) {
                break;
            }
            reversedIndex++;
        }

        if (reversedIndex == word.length()) {
            return word;
        }

        String reversedWord = word.substring(0, reversedIndex + 1);
        String directWord = word.substring(reversedIndex + 1);

        return new StringBuilder(reversedWord).reverse().append(directWord).toString();
    }
}
