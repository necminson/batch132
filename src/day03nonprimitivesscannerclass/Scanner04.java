package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

         /*
            Type a program which calculates the volume of a rectangular prism
            whose length, width, and height are entered by user.
            Hint 1: Volume of a rectangular prism is width x length x height
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter length, width, and height...");

        double length = input.nextDouble();
        double width = input.nextDouble();
        double height = input.nextDouble();

        System.out.println("The volume is " + (width*length*height));
    }
}