package com.codingwithjee.Chapter2_Types;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {

        /* Principal*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal : ");
        Long principal = scanner.nextLong(); // stored principal...

                /* Annual Interest Rate */
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Annual Interest Rate : ");
        float annualInterestRate1 = scanner1.nextFloat(); // stored montlyInterestRate...
        float montlyInterestRate = ((annualInterestRate1) / 100)/12; // stored it into decimals

        /* Period (Years) */
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Period (Years) : ");
        byte period = scanner2.nextByte(); // stored value of Period...
        int months = period * 12; // calculated into months

//  have all the integers keyed in...! ... Now need to calculate

        double finalMortgagePayment = principal * (annualInterestRate1 * (Math.pow(1 + montlyInterestRate, months))) / (Math.pow(1 + montlyInterestRate, months) - 1); // final value of mortgage payment

        // change the format into currency and decimals
//        String finalMortgagePaymentFormatted = NumberFormat.getCurrencyInstance().format(finalMortgagePayment);
        System.out.print("Mortgage: " + Math.round(finalMortgagePayment)); // final value
        }

                                    /* [Project1 : Mortgage Calculator]*/
        /* Principal: amount of money we borrow
        * Annual Interest Rate: 3.92
        * Period (Years): 30 years
        * Mortgage: $*/
    }
