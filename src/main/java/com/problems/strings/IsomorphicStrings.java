package com.problems.strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    static void main() {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("bbbaaaba", "aaabbbba"));
        System.out.println(isIsomorphic("badc", "baba"));
    }

    public static boolean isIsomorphic(final String s, final String t) {
        final Map<Character, Character> characterSMap = new HashMap<>();
        final Map<Character, Character> characterTMap = new HashMap<>();

        final StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            final char letterS = s.charAt(i);
            final char letterT = t.charAt(i);

            if(!characterSMap.containsKey(letterS)) {
                characterSMap.put(letterS, letterT);
            }
            if(!characterTMap.containsKey(letterT)) {
                characterTMap.put(letterT, letterS);
            }

            if(characterSMap.get(letterS) == letterT && characterTMap.get(letterT) == letterS) {
                result.append(characterSMap.get(letterS));
            }
        }


        return t.contentEquals(result);
    }
}
