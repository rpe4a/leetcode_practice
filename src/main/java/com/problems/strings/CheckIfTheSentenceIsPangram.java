package com.problems.strings;

public class CheckIfTheSentenceIsPangram {
    static void main() {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangram("leetcode"));
    }

    public static boolean checkIfPangram(String sentence) {
        var result = new int[26];
        for (var i = 0; i < sentence.length(); i++) {
            var c = sentence.charAt(i);
            result[c - 'a']++;
        }

        for (var i = 0; i < result.length; i++) {
            if (result[i] == 0) {
                return false;
            }
        }

        return true;
    }

}
