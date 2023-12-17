package com.codingwithjee.Chapter3_ControlFlow;

import java.util.Scanner;

public class FizzExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.print("Number : ");
        int input = scanner.nextInt(); // we have the input of the number

//  we should have the most specific conditions at the top and the most generic ones at the bottom!

//        if (input % 5 == 0) {
//            if (input % 3 == 0)
//                System.out.println("FizzBuzz");
//            else
//                System.out.println("Fizz");
//        }
//  this 2 lines from here are not needed
        if (input % 3 == 0 && input % 5 == 0) // we inputted input % 5 two times
            System.out.println("FizzBuzz");
        else if (input % 5 == 0)
            System.out.println("Fizz");
        else if (input % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(input);
        }


        }

