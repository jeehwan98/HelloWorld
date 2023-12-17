package com.codingwithjee.Chapter3_ControlFlow;

public class Part1 {
    public static void main(String[] args) {
        /* Comparison Operators (comparing values)
         * Logical Operators (and, or, not) used for implementing real word roots?
         * Conditional Statments
         * Loops
         */

        /* [Comparison Operators] */
//  used to compare primitive values
        int x = 1;
        int y = 1;
        System.out.println(x == y); // "==" = quality operator... boolean expression.

        /* Logical Operators */
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30; // m operator = represent logical and operator in Java.
        System.out.println(isWarm); // both conditions are same = true. if not = false.

        boolean hasHighIncome = true;
        boolean hasGoodCredit = false;
        boolean isEligible = hasHighIncome || hasGoodCredit; // "||" = or, if either of the condition is true = true
        System.out.println(isEligible);

        boolean hasHighIncome1 = false;
        boolean hasGoodCredit1 = true;
        boolean hasCriminalRecord = false;
        boolean isEligible1 = (hasHighIncome1 || hasGoodCredit1) && !hasCriminalRecord; //! added infront of the variable to make it not true
        System.out.println(isEligible1);

        /* [If Statements] */ // important as it allows us to make decisions based on certain conditions */

//        If temp is greater than 30
//            It's a hoy day
//            Drink plenty of water
//        Otherwise, if it's between 20 and 30
//            It's a nice day
//        Otherwise
//            It's cold

        int temp = 25;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        }
        else if (temp > 20)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold Day");

/* ================================================================================================================== */

        int income = 80_001;
        if (income > 100_000) { // declaration not allowed here = no {}
            System.out.println("You're rich");
        }
        else if (income >= 80_000)
            System.out.println("Not bad");
        else
            System.out.println("You're broke");


    }
}
