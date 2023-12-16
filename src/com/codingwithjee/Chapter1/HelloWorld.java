package com.codingwithjee.Chapter1; // section1 belongs to package.

public class HelloWorld {
// comment = explain our code to other people
    public static void main(String[] args) {
        /*
        * "public" = accessible from anywhere
        * "void" = does not return a value
        * parenthesis "(String[] args)" = 1 parameter for the function. We can use parameters to pass values to our programs
        * */
        System.out.println ("Hello World!"); // dot operator (.) is used to see the members defined in the system class. (미리 정의한 메소드는 참조연산자(.)를 통해 호출할 수 있다.)
        // control + R (shortcut key!)
    }

public void secondCourse() {
/* Java program i
* Compilation = uses Java compiler, taking a programmer-readable text in file and convert to bytecodes, which are platform-independent (Java Bytecode),
* meaning that it can run on Mac, Linux, and other OS that have Java runtime environment (JRE)
* JRE has a software compartment = Java Virtual Machine (JVM)
* JVM helps translate bytecode > native code for the underline operating system, for the OS to understand.
*
* JDK =
* Execution*/

    /* [To check how Java operates]
    * shift + shift > terminal
    * Type javac "file", which is (section1.java)
    * enter "ls" (mac), "dir" (windows) : to see all the files
    * ls/dir gives us 2 files = 1 new file (section1.class) and a bytecode of another file (section1.java)
    * section1.class gets stored somewhere else.
    *
    * go back to src and type in "java com.codingwithjee.section1
    * This will print out "Hello World!"
    * This is how the Java operates
    * */
}




}