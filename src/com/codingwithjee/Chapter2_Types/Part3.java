package com.codingwithjee.Chapter2_Types;


import java.util.Arrays; // import를 해야 Arrays를 사용이 가능합니다
import java.util.ArrayList;
import static java.lang.Math.PI;

public class Part3 {
    public static void main(String[] args) {
                                                /* [Array] */
//  used to store a list of items
        int[] numbers = new int[5]; // because it's reference type
        numbers[0] = 1; //
        numbers[1] = 2;
//  numbers[10] = 3; // crashed... because there is no 10
        System.out.println(numbers); // weird string... Java returns the string's address in memory.
//  We have a class called array!
        System.out.println(Arrays.toString(numbers)); //others are set to 0 by default because we're dealing with integer array, if we had boolean, all items would be false

        int[] numbers1 = {2, 3, 5, 1, 4};
        Arrays.sort(numbers1); // sort the numbers
        System.out.println(Arrays.toString(numbers1)); // prints the numbers into sequences.
        System.out.println(numbers1.length); // Python이랑 비슷하다... print(numbers.length)

        int[][] numbers2 = new int [2][3]; // we can create multidimensional arrays... repeat [] on the other side
        numbers2[0][0] = 1; // first column and first row
//  System.out.println(Arrays.toString(numbers2)); // weird string because we're using multidimensional array
//  to solve this problem, we need to use deepToString
        System.out.println(Arrays.deepToString(numbers2)); //

//  if we want to print 3D array
        int[][] numbers4 = {{1,2,3}, {4,5,6}}; //new int!!! // 모르겠음
        System.out.println(Arrays.deepToString(numbers4));

//        final float PI = 3.14F; // when type is something of a different value, address the type for it
//  final = treated as a constant. cannot change it.
        System.out.println(PI);
    }
 }

