package com.codingwithjee.Chapter3_ControlFlow;
import java.util.Scanner;
public class Part3 {
    public static void main(String[] args) {
        /* For Loops */
//  "for" keyword
//  // 1. declare a loop or counter variable
//        for (int i = 1; i <= 5; i++) // ; terminate the first statement and write a boolean expression
//            System.out.println("Hello World " + i);
//
//        /* While Loops */
//
//        int i = 0;
//        while (i > 0) { // better in situations when we don't know how many times we want to repeat something
//            System.out.println("Hello World" + i);
//            i--;
        Scanner scanner = new Scanner(System.in);
        String  input = ""; // check whether the user entered quit or not
        /* Do while loop */ // gets executed only once... use while loops rather than do while loops
        while (true) { // can be simplified... continues forever until the user types quit
//        while (!input.equals("quit")) { //.equals = ==
            System.out.print("Input: ");
            input = scanner.next().toLowerCase(); // change the input to a lowercase
//            if (!input.equals("quit"))
            if (input.equals("pass"))
                continue; // moves control to the beginning of a loop
            if (input.equals("quit")) // is same as the one just above this
                break; // terminates a loop
            System.out.println(input);
            // the word "quit" gets echoed back before printing..!


        }

//        do { // change the input to a lowercase
//            System.out.print("Input: ");
//            Scanner scanner = new Scanner(System.in);
//            input = scanner.next().toLowerCase();
//            System.out.print(input);
//        } while (!input.equals("quit")); // check the condition last

        /* Break and Continue */
    }
}
