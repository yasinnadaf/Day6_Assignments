package com.bridgelabz.junit;

import java.util.Scanner;

public class VendingMachine {

    static int i,total;

    static int[] notes = {1000,500,100,50,20,10,5,2,1};

    static void notes(int value){
        if(value/notes [i] !=0){
            total += (value/notes[i]);
            System.out.println(notes[i] + "rs notes :" +value/notes[i]);
            value = value%notes[i];

        }
        i++;
        if(value == 0){
            System.out.println("total notes "+total);
            return;
        }
        notes(value);
    }

    public static void main(String[] args) {
        try {
            Scanner scr = new Scanner(System.in);
            System.out.println("enter amount");
            int value = scr.nextInt();
            notes(value);
            scr.close() ;
        } catch (Exception e) {
            System.out.println("enter value in integer");
        }
    }

}
