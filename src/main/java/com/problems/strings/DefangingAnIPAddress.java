package com.problems.strings;

public class DefangingAnIPAddress {
    static void main() {
        System.out.println(defangIPaddr("255.255.255.0"));
    }

    public static String defangIPaddr(String address) {
        var sb = new StringBuilder();
        for (char c : address.toCharArray()) {
            if (c == '.') {
                sb.append("[.]");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
