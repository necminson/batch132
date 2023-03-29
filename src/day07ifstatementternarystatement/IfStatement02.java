package day07ifstatementternarystatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        /*
        Example 1: GET USER'S AGE
                    0-4 ===> Baby  -  5-12 ===> Kid  -  13-20 ===> Teenager   -   21-30 ===> Adult
                   Other  ===> Undefined    -   Negative ages ===> Invalid age
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        byte age = input.nextByte();

        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age<5) {
            System.out.println("Baby");
        } else if (age<13) {
            System.out.println("Kid");
        } else if (age<21) {
            System.out.println("Teenager");
        } else if (age<31) {
            System.out.println("Adult");
        } else {
            System.out.println("Undefined");
        }













    }

}
