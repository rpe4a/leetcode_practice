package com.problems.arrays;

public class DeleteColumnsMakeSorted {
    static void main() {
        System.out.println(minDeletionSize(new String[]{"cba", "daf", "ghi"}));
        System.out.println(minDeletionSize(new String[]{"a", "b"}));
    }

    public static int minDeletionSize(String[] strs) {
        var results = new char[strs[0].length()][strs.length];
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                results[j][i] = strs[i].charAt(j);
            }
        }

        var delete = 0;
        for (int col = 0; col < results.length; col++) {
            var arr = results[col];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    delete++;
                    break;
                }
            }
        }

        return delete;
    }
}
