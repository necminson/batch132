package day10forloop;

import java.util.Scanner;

public class NestedForLoop01 {

    public static void main(String[] args) {

        /*
                    2.Example:Type code to get the output like
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                       Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                       Week: 4
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
         */

        /*
            Nested loops are "time-consuming", that is why if it is not mandatory, do not prefer to use "Nested Loops"
            If a code is "time-consuming" it means it has "time complexity"
            There is a way to calculate the value of "time complexity": if you have 2 loops, the time complexity is the square of 2 ==> 4
                                                                        if you have 3 loops, the time complexity is the cube of 3 ==> 27
         */
        for(int i=1; i<5; i++){
            System.out.println("Week: " + i);
            for(int k=1; k<8; k++){
                System.out.println("   Day: " + k);
            }
        }

       /*
            Example 3: Write a Java Program to Print Rectangle Star Pattern using For Loop
                        ****
                        ****
                        ****
            Note: Get the number of rows and columns from user
        */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int rows = input.nextInt();

        System.out.println("Enter the number of columns");
        int columns = input.nextInt();

        for(int i=1; i<=rows; i++){

            for(int k=1; k<=columns; k++){

                System.out.print("*");

            }

            System.out.println();

        }

    }
}