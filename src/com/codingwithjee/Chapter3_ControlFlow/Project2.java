package com.codingwithjee.Chapter3_ControlFlow;

import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        // Principal ($1K - $1M):

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal ($1K - $1M): ");
        int inputPrincipal = scanner.nextInt(); // inputPrincipal = Principal keyed in

        while (inputPrincipal < 1_000 || inputPrincipal > 1_000_000)
            System.out.println("Enter a number between 1,000 and 1,000,000"); // keep repeating the statement


        if (inputPrincipal > 1_000 && inputPrincipal <= 1_000_000)
            System.out.println("Annual Interest Rate: ");

//  gives me an infinite statement of "Annual Interest Rate: " ...








        }
    }
