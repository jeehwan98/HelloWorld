package com.codingwithjee.Chapter2_Types;

import java.util.Date; // to print out the current time
import java.awt.*; //
public class Part1 {
                                            /* [Variables]
* temporary store data
* */
    public static void main(String[] args) {
        int age = 30, temperature = 20; // int = type of the variable, age = identifier (identify our variable), "=" = assignment operator
        // we can decalre multiple variables in the same line using a "," ... 추천하지 않는다!
        // initializing a given value
        age = 35; // change the value of age to 35
        System.out.println("age : " + age);

        int myAge = 30; // camelcase notation: declaring and initializing variables
        int herAge = myAge;
        System.out.println("herAge : " + herAge);

                                         /* [Categories of types]
* Primitive: for storing simple values
* Non-primitive types/Reference: for storing complex objects
*  */

                                        /* [Primitive types] */
//  eg) numbers, characters, booleans

/* Whole number (정수형)
* byte:     1 byte:     [-128 ~ 127]
* short:    2 byte:     [-32K ~ 32K]
* int:      4 byte:     [2B ~ 2B]
* long:     8 byte:
*/

    /*  (정수형)
* float:    4 byte:
* double:   8 byte:
*  */

    /* (문자형)
* char:     2 byte:     [A,B,C,...]
* * */

    /* (논리형)
* boolean:  1 byte:     [true/false]
* * */

        byte age1 = 30;
        long viewCount = 3_123_456_789L; //use an L to indicate it to be a long type.
//  always use meaningful descriptive names for variables, _ to separate digits

        float price = 10.99F; // add a suffix to represent the number as a float!
        char letter = 'A';
        boolean isEligible = false; // orange letters = reserved keywords in Java

                                        /* [Reference type] */
//  eg) date, messages, etc..

        byte age2 = 30;
        Date time = new Date();// "new" operator to allocate a memory for this variable.
        /* When always dealing with reference types, we should always allocate memory */
        System.out.println(time);

        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y); // y is not affected because x & y are completely independent of each other

        Point point1 = new Point(1, 1); // Point class
        Point point2 = point1; // store a reference to an object, somewhere in the memory
//  point1 and point2 are referencing the exact same point object in the memory.
        point1.x = 2;
        System.out.println(point2);
        /* System.out.println(y); 의 값과 System.out.println(point2); 의 값이 다른 이유: reference variable = copied by reference.  primitive variable = copied by value, which is completely independent of each other. */

    }

}
