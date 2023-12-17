package com.codingwithjee.Chapter2_Types;

public class Part4 {

    public static void main(String[] args) {
                                     /* [arithmetic expression] */

        int result = 10 / 3; // to get a float, we need to convert the number
        double result1 = (double) 10 / (double) 30; // numbers 10 and 30 are called "operands"
        System.out.println("result : " + result);
        System.out.println("result1 : " + result1);
//  increment and decrement operator
        int x  = 1;
        x++; //postfix... ++x (prefix) 과 같다
        System.out.println("x : " + x);
        x+=1; // augmented or compound assignment operator
        System.out.println("x : " + x);

                                        /* [order of operations] */
        int b = 10 + 3 * 2;
        System.out.println("b : " + b);

                                            /* [casting] */

        short ab1 = 1; // one is short
        int yb1 = ab1 + 2; // other is int
        System.out.println("yb1 : " + yb1);
//  2 different types of values: short, integer. 1 must be converted to another so that they're equal.
//  implicit (automatic) casting: casting a lower data value type to a higher data value type ** without incurring any data loss **
//  byte > short > int > long (sequence) > float > double
//  float > double
        double abc = 1.1;
//  in order to print abc as an integer, change the type
        int ybc = (int)abc + 2; // 1.1 > integer 1, and added to 2
        System.out.println("ybc : " + ybc);
//  explicit casting can only happen between compatible types. numbers > numbers ... string > number X
//  to classify String as an integer, we use "parseInt"
        String asd = "1";
        int ysd = Integer.parseInt(asd) + 2; // turn string into an integer
        System.out.println("ysd : " + ysd);
    /*  importance of using parseInt = in building user interface, we always receive input from the user as a string.
    * which is the reason why we need to convert these strings to their numerical representation. */

//  Short.parseShort() >> takes string and return short 기타 등등...

                                            /* [Math Class] */

        int result123123 = Math.round(1.1F);
        System.out.println("rounding a number : " + result123123);
        int result12341234 = (int)Math.ceil(1.2F); // ceil/ceiling returns the larger integer that is >= or = to the number
        System.out.println("rounding the number to ceiling : " + result12341234);
        int result123123123 = (int)Math.floor((1.2F));
        System.out.println("rounding the number to floor : " + result123123123);// floor returns the integer to the smaller integer
        int result1010101 = Math.max(2,23);
        System.out.println("finding the max number : " + result1010101);
        int result01010 = Math.min(303,32);
        System.out.println("finding the min number : " + result01010);
        double result9898 = Math.random(); // multiply by 100 to get a random number between 0~100
        System.out.println("finding a random number between 0 ~ 1 : " + result9898); // prints a random number between 0~1... if want a number between 0~100
//  if want to round the number to an integer
//        float result77 = Math.round(Math.random() *  100); // if we want to round the number to an integer,
        int result77 = (int)Math.round(Math.random() * 100); // implicit casting doesn't work,,, so use explicit casting
//  implicit casting is done automatically by the computer when there is no loss of work.
//  explicit casting has to be done manually,,, could result in a loss of data eg) (int) ...
        System.out.println("finding a random number between 0 ~ 100 : " + result77);
//  to get a random integer number between 0~100
        int resultHiHi = (int)(Math.random() * 100); // easier method
        System.out.println("easier method : " + resultHiHi);
    }
}
