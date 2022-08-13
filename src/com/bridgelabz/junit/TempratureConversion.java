package com.bridgelabz.junit;

import java.util.Scanner;

public class TempratureConversion {
    static void temperatureConversion(){

        Scanner scr = new Scanner(System.in);
        System.out.println("Press (F or f) to covert from fahrenheit to Celsius or Press (C or c) to convert from Celsius to fahrenheit :");
        char ch = scr.next().charAt(0);

        if (ch =='f'|| ch=='F'){
            System.out.println("Enter the temperature to convert from fahrenheit to Celsius");
            double f = scr.nextDouble();
            double c = (f-32)*5/9;
            System.out.println(f + " degree fahrenheit is " +c+ " degree Celsius" );
        }
        else if (ch =='c'|| ch=='C') {
            System.out.println("Enter the temperature to convert from Celsius to fahrenheit");
            double c = scr.nextDouble();
            double f = (c*9/5)+32;
            System.out.println(c + " degree  Celsius  is " +f+ " degree fahrenheit" );
        }
    }

    public static void main(String[] args) {
        temperatureConversion();
    }
}