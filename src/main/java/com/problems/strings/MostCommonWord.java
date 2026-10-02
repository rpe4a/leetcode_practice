package com.problems.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
    static void main() {
        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
        System.out.println(mostCommonWord("a.", new String[0]));
        System.out.println(mostCommonWord("Bob", new String[0]));
        System.out.println(mostCommonWord("Bob. hIt, baLl", new String[]{"hit", "bob"}));
        System.out.println(mostCommonWord("a b.b", new String[0]));
    }

    public static String mostCommonWord(final String paragraph, final String[] banned) {
        final Set<String> setBannedWords = new HashSet<>(Arrays.asList(banned));
        final HashMap<String, Integer> map = new HashMap<String, Integer>();
        int left = 0;
        int right = 0;
        while (right < paragraph.length()) {
            if (!Character.isAlphabetic(paragraph.charAt(right))) {
                addWord(paragraph, map, left, right, setBannedWords);
                left = right + 1;
            }
            right++;
        }

        if (left != right) {
            addWord(paragraph, map, left, right, setBannedWords);
        }

        Map.Entry<String, Integer> maxWord = null;
        for (final Map.Entry<String, Integer> entry : map.entrySet()) {
            if (maxWord == null) {
                maxWord = entry;
            }
            if (maxWord.getValue() < entry.getValue()) {
                maxWord = entry;
            }

        }

        return maxWord.getKey();
    }

    public static void addWord(String paragraph, HashMap<String, Integer> map, int left, int right, Set<String> bannedWords) {
        final String word = paragraph.substring(left, right).toLowerCase();
        if (!word.isEmpty() && !bannedWords.contains(word)) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
    }
}
