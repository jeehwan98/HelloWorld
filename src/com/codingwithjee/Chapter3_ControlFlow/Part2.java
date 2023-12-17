package com.codingwithjee.Chapter3_ControlFlow;

public class Part2 {
    public static void main(String[] args) {
                                            /* Ternary Operator */
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy"; // if true, "First" would be returned... if not "Economy" would be returned

        String role = "admin"; // not only words but only numbers as well
                                            /* Switch statement */
        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break; // to jump out of the switch block

            case "moderator":
                    System.out.println("You're a moderator");
                    break;

            default: // if none of the previous cases are applied, this is applied
                System.out.println("You're a guest");
        }

        if (role == "admin") {
            System.out.println("You're an admin");}
        else if (role == "moderator") {
            System.out.println("You're a moderator"); }
        else {
            System.out.println("You're a guest"); }

//  using a switch statement makes it cleaner...!





    }
}
