package com.codingwithjee.Chapter2_Types;

public class Part2 {
    public static void main(String[] args) {

                                                  /* [Strings] */

//  storing the parameter into String
        String message = "Hello World" + "!!   "; // Strings are reference types in Java
        message.endsWith("");
        System.out.println(message.endsWith("!!")); // returns a boolean value
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length()); // length of the text
        System.out.println(message.indexOf("H")); // placement of the letter
        System.out.println(message.indexOf("e"));
        System.out.println(message.indexOf("sky")); // -1 because the word "sky" doesn't exist

                                            /* [Parameters and Arguments]

* * Parameters = holes that we define in the methods.
* Arguments = actual values that we pass to the methods.
* * */
        System.out.println(message.replace('!', '*')); // oldChar and newChar are parameters and !,* are arguments
        // replace doesn't modify our original string, but returns a new string
        System.out.println(message); //original string is not changed... because in Java, strings are immutable. We cannot change them. Always return a new string object.

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim()); // space behind the World!! is trimmed


                                                /* [Escape Sequences] */
/*  4 escape sequences used in Java
* * 1. \:     backslash
* * 2. \\:    print out 1 \
* * 3. \n:    new line
* * 4. \t:    add tab
* * */

        String message1 = "Hello \"Jee\"";
        System.out.println(message1);// if we add \to the "Jee, we can escape the "".
        // c:\Windows\...
        String message2 = "c:\\Windows\\..."; // to print \, we have to use 2 \\
        System.out.println(message2);
        String message3 = "c:\nWindows\\..."; // \n inserts a new line
        System.out.println(message3);
        String message4 = "c:\tWindows\\..."; // add a [tab] in between c: and Windows
        System.out.println(message4);



    }
}