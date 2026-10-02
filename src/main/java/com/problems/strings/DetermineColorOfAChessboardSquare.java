package com.problems.strings;

public class DetermineColorOfAChessboardSquare {
    static void main() {
        System.out.println(squareIsWhite("a1"));
        System.out.println(squareIsWhite("h3"));
        System.out.println(squareIsWhite("c7"));
    }

    public static boolean squareIsWhite(String coordinates) {
        int character = coordinates.charAt(0) - 'a';
        int number = coordinates.charAt(1) - '1';

        if (character == number) {
            return false;
        }
        return (character + number) % 2 == 0 ? false : true;
    }
}
