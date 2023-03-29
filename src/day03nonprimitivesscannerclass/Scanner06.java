package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner06 {

    public static void main(String[] args) {

        //Example 1: Ask user to enter his first and the last name and address then print them on the console.
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your address...");
        String address = input.nextLine();//It is for getting all String from the first character to the last character

        System.out.println("Please enter your first name...");
        String firstName = input.next();//It is for getting just the first word in a String

        System.out.println("Please enter your last name...");
        String lastName = input.next();

        System.out.println(firstName + " " + lastName);
        System.out.println(address);


    }


}