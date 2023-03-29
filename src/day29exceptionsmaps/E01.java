package day29exceptionsmaps;

public class E01 {

        /*
            What are the differences between "throw" and "throws" keywords?
            1)"throw" is used inside the "method body", "throws" is used in the method signature line
            2)"throw" can be used multiple times in a method body, "throws" can be used just once in the method signature line
            3)After "throw" we create an "Exception Object", after "throws" we type just the name of the "Exception Class"
            4)After "throw" you can throw just a single Exception,  after "throws" you can throw multiple Exceptions
            5)"throw" can be used just to throw "Run Time Exceptions"(Un-checked Exceptions),
              "throws" can be used to throw both "Run Time Exceptions" or "Compile Time Exceptions"(Checked Exceptions)

            How to create our own Exception Classes
            1)Java created its own Exception Classes for common issues like dividing by zero, using non-existing indexes etc.
              As a developer we may need our own strict rules in our application.
              To create our own strict rules in our application we create our own Exception Classes.
              Our own Exception Classes are called "Custom Exception Classes"
            2)"Custom Exception Classes" can be i)Run Time Exception or ii)Compile Time Exception
              To create Custom Run Time Exception, you must extend to "RuntimeException Class"
              To create Custom Compile Time Exception, you must extend to "Exception Class"
              Every Exception Class should have "Exception" word at the end
         */

    public static void main(String[] args) {

    }

}