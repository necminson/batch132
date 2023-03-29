package day08ternaryswitch;

public class Loops01 {

        /*
            When we need to do "repeated actions" in Java we use loops
         */

    public static void main(String[] args) {

        //Example 1:Type "Hi!" 5000 times on the console

        //1.Way:
        //To do repeated actions, typing repeated codes is not acceptable.
        //Because, repeated codes are not good at update, fix, type
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2.Way:There are 4 loops in Java; i)for-loop ii)while-loop iii)do-while-loop iv)for-eah-loop
        //   Starting Value  Condition  Increment/Decrement
        for(     int i=1   ;   i<6    ;       i = i+1  ){

            System.out.println("Hi!");

        }

    }

}