package com.problems.strings;

public class CountResiduePrefixes {
    static void main() {
        System.out.println(residuePrefixes("abc")); // 2
        System.out.println(residuePrefixes("dd")); // 1
        System.out.println(residuePrefixes("bob")); // 2
    }

    public static int residuePrefixes(String s) {
        var count = 0;
        for (var i = 1; i <= s.length(); i++) {
            var sub = s.substring(0, i);
            var characters = new int[26];
            for (var j = 0; j < sub.length(); j++) {
                characters[sub.charAt(j) - 'a']++;
            }
            var unique = 0;
            for (var j = 0; j < characters.length; j++) {
                if (characters[j] > 0) {
                    unique++;
                }
            }
            if (unique == sub.length() % 3) {
                count++;
            }
        }

        return count;
    }
}
