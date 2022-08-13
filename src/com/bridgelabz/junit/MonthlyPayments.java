package com.bridgelabz.junit;

import java.util.Scanner;

public class MonthlyPayments {

    static void monthlyPayment(){
        Scanner scr = new Scanner(System.in);
        System.out.println("enter principle amount :");
        double principle = scr.nextDouble();
        System.out.println("enter term of loan in years :");
        double years = scr.nextDouble();
        System.out.println("enter interest rate: ");
        double rate = scr.nextDouble();
        double n = 12*years;
        double r = rate/(12*100);
        double payment = (principle*r)/(1-Math.pow((1+r),(-n)));
        System.out.println("payment is :"+payment);

    }

    public static void main(String[] args) {
        monthlyPayment();
    }
}
