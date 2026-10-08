package com.problems.strings;

import java.util.HashSet;

public class ValidWord {
    static void main() {
//        System.out.println(isValid("234Adas"));
//        System.out.println(isValid("b3"));
        System.out.println(isValid("UuE6"));
        System.out.println(isValid("AhI"));
    }

    public static boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }

        var mapVowels = new HashSet<Character>();
        mapVowels.add('a');
        mapVowels.add('e');
        mapVowels.add('i');
        mapVowels.add('o');
        mapVowels.add('u');

        var vowels = 0;
        var consonants = 0;
        for (char c : word.toCharArray()) {
            if (!Character.isLowerCase(c) && !Character.isUpperCase(c) && !Character.isDigit(c)) {
                return false;
            }
            var cLower = Character.toLowerCase(c);
            if (mapVowels.contains(cLower)) {
                vowels++;
            } else if (!Character.isDigit(cLower)) {
                consonants++;
            }
        }

        return vowels >= 1 && consonants >= 1;
    }
}
