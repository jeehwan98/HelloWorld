package com.codingwithjee.Chapter3_ControlFlow;

import java.util.Scanner;

public class finalProjectTest2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int principal = 0;
        float montlyInterestRate = 0;
        int numberOfPayments = 0;

        while (true) {
            System.out.print("Principal : ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }

        while (true) {
            System.out.print("Annual Interest Rate : ");
            float annualInterestRate = scanner.nextFloat();
            if (annualInterestRate >= 1 && annualInterestRate <= 30) {
                montlyInterestRate = annualInterestRate / 12;
                break;
            }
            System.out.println("Enter a value between 0 and 30");
        }
        while (true) {
            System.out.print("Period (Years) : ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * 12;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

            double finalMortgagePayment = principal * (montlyInterestRate * (Math.pow(1 + montlyInterestRate, 12))) / (Math.pow(1 + montlyInterestRate, numberOfPayments) - 1); // final value of mortgage payment
            System.out.println("Final Mortgage : " + finalMortgagePayment);
        }
    }