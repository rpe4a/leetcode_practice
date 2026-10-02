package com.problems.strings;

public class NumberOfDaysBetweenTwoDates {
    static void main() {
        System.out.println(daysBetweenDates("2019-06-29", "2019-06-30")); // 1
        System.out.println(daysBetweenDates("2020-01-15", "2019-12-31")); // 15
        System.out.println(daysBetweenDates("1971-06-29", "2010-09-23")); // 14331

    }

    private static int[] MONTHS = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int daysBetweenDates(String date1, String date2) {
        var days1 = getDays(date1);
        var days2 = getDays(date2);

        return Math.abs(days1 - days2);
    }

    private static int getDays(final String date) {
        var year = Integer.parseInt(date.substring(0, 4));
        var month = Integer.parseInt(date.substring(5, 7));
        var day = Integer.parseInt(date.substring(8, 10));

        return getYear(year) + getMonth(month, year) + day;
    }

    private static int getYear(final int year) {
        var days = 0;
        for (var i = 1971; i < year; i++) {
            if (isLeapYear(i)) {
                days += 366;
            } else {
                days += 365;
            }
        }

        return days;
    }

    private static int getMonth(final int month, final int year) {
        var days = 0;

        for (var i = 0; i < month - 1; i++) {
            if (i == 1) { // February
                if (isLeapYear(year)) {
                    days += 29;
                } else {
                    days += 28;
                }
            } else {
                days += MONTHS[i];
            }
        }

        return days;
    }

    private static boolean isLeapYear(final int year) {
        return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
    }
}

