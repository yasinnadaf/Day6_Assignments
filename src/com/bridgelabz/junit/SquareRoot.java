package com.bridgelabz.junit;

import java.util.Scanner;

public class SquareRoot {

    static void sqrt (int c) {
        double Epsilon = 1E-15;
        double t = c;
        while (Math.abs (t - c / t) > Epsilon * t)
            t = (c / t + t) / 2;
        System.out.println("t");


    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter the number to compute sqrt :");
        int num = scr .nextInt();
        sqrt(num);
    }

}


