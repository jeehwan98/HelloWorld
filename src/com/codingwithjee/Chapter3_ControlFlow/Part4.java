package com.codingwithjee.Chapter3_ControlFlow;

public class Part4 {
    public static void main(String[] args) {
                    /* For each loop */ // used to iterate over arrays or collections
        String[] fruits = {"Apple", "Mango" , "Orange"};

        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]); // i represents the index of the items, fruits[i] returns the item at the given index.

        for (String fruit : fruits)
            System.out.println(fruit);

//  for each loop has limitation: always forward... we don't have access to the index of each item.
//  for loop: can be done easily
        // for (int i = fruits.length; i > 0; i--)
    }
}
