package com.problems.strings;

public class AddBinary {

    static void main() {
        System.out.println(addBinary("1010", "1011")); // 10101
//        System.out.println(addBinary("11", "1")); // 100
    }

    public static String addBinary(final String a, final String b) {
        String shorter = a.length() > b.length() ? b : a;
        final String longer = a.length() > b.length() ? a : b;
        int diff = longer.length() - shorter.length();

        while (diff > 0) {
            shorter = "0" + shorter;
            diff--;
        }

        final StringBuilder sb = new StringBuilder();
        int rank = 0;
        for (int i = longer.length() - 1; i >= 0; i--) {
            final Character value1 = shorter.charAt(i);
            final Character value2 = longer.charAt(i);

            if ('0' == value1 && '0' == value2) {
                sb.append(rank);
                rank = 0;
            } else if ('1' == value1 && '1' == value2) {
                sb.append(rank);
                rank = 1;
            } else if ('0' == value1 && '1' == value2 || '1' == value1 && '0' == value2) {
                if (rank == 1) {
                    sb.append('0');
                } else {
                    sb.append('1');
                }
            }
        }

        if (rank == 1) {
            sb.append('1');
        }

        return sb.reverse().toString();
    }
}
