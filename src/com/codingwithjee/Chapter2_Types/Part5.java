package com.codingwithjee.Chapter2_Types;

import java.text.NumberFormat;
import java.util.Scanner;

public class Part5 {
    public static void main(String[] args) {
                                            /* [Formatting numbers] */

//  1234567 > we want to add a $1234567 and separate every 3 digits with a comma
//        NumberFormat currency = new NumberFormat() // we cannot create NumberFormat because it's an abstract.
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891); // this method will return a string representation of this number
        System.out.println(result);
    // used for handling text, dates, numbers and so on.

        NumberFormat percentage = NumberFormat.getPercentInstance();
        String result1 = percentage.format(0.10);
        System.out.println(result1);

                                            /* [Reading Input] */
//  how to rate input from the user
        Scanner scanner = new Scanner(System.in); // in the parenthesis (), we need to specify where we're going to read the data from.
//  to work from a terminal, we type "system.in"... similar to input() in Python
        System.out.print("Age: ");
        byte age = scanner.nextByte(); // this method can only parse byte values... to get a floating number, we need to add nextFloat or nextDouble.
//  There's no String... only 1. next. and nextln
        System.out.println("You are " + age);
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Name: "); // "Jee Hwan" = tokens. everytime we read the next method, it only reads one token.
        String name = scanner1.nextLine().trim(); // which is the reason why we use nextLine()
        System.out.println("You are " + name);
// to trim the spaces in between
    }
}
