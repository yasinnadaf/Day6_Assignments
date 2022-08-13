package com.bridgelabz.junit;


import java.util.Scanner;

public class DayOfWeek {

    static void weekName(int d0) {

        if (d0 == 0) {
            System.out.println("Sunday");
        } else if (d0 == 1) {
            System.out.println("Monday");
        } else if (d0 == 2) {
            System.out.println("Tuesday");
        } else if (d0 == 3) {
            System.out.println("Wednesday");
        } else if (d0 == 4) {
            System.out.println("Thursday");
        } else if (d0 == 5) {
            System.out.println("Friday");
        } else {
            System.out.println("Saturday");
        }

    }

    static void dayOfWeek() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter month");
        int m = scr.nextInt();
        System.out.println("Enter day");
        int d = scr.nextInt();
        System.out.println("Enter year");
        int y = scr.nextInt();
        System.out.println();

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        weekName(d0);


    }

    public static void main(String[] args) {
        dayOfWeek();
    }
}