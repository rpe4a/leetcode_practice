package com.problems.strings;

public class CheckIfTwoStringArraysAreEquivalent {
    static void main() {
        System.out.println(arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        var sb1 = new StringBuilder();
        for (String str : word1) {
            sb1.append(str);
        }

        var sb2 = new StringBuilder();
        for (String str : word2) {
            sb2.append(str);
        }

        return sb1.toString().contentEquals(sb2);
    }
}
