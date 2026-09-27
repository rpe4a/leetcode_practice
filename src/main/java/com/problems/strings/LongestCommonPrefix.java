package com.problems.strings;

public class LongestCommonPrefix {

    static void main() {
//        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"cir", "car"}));
//        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    public static String longestCommonPrefix(final String[] strs) {
        int minWordSize = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            minWordSize = Math.min(minWordSize, strs[i].length());
        }

        final String[] result = new String[minWordSize];
        for (int i = 0; i < minWordSize; i++) {
            for (int j = 0; j < strs.length; j++) {
                final char character = strs[j].charAt(i);
                if (result[i] == null) {
                    result[i] = String.valueOf(character);
                }

                if (result[i].equals(String.valueOf(character))) {
                    result[i] = String.valueOf(character);
                } else {
                    result[i] = "_";
                    break;
                }
            }
        }

        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            if (result[i] == "_") {
                return sb.toString();
            }
            sb.append(result[i]);
        }

        return sb.toString();
    }

    public static String longestCommonSubstring(final String[] strs) {
        int minWordSize = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            minWordSize = Math.min(minWordSize, strs[i].length());
        }

        final String[] result = new String[minWordSize];
        for (int i = 0; i < minWordSize; i++) {
            for (int j = 0; j < strs.length; j++) {
                final char character = strs[j].charAt(i);
                if (result[i] == null) {
                    result[i] = String.valueOf(character);
                }

                if (result[i].equals(String.valueOf(character))) {
                    result[i] = String.valueOf(character);
                } else {
                    result[i] = "_";
                    break;
                }
            }
        }

        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]);
        }

        final String[] prefixes = sb.toString().split("_");

        String prefix = "";
        for (int i = 0; i < prefixes.length; i++) {
            if (prefix.length() < prefixes[i].length()) {
                prefix = prefixes[i];
            }
        }

        return prefix;
    }
}
