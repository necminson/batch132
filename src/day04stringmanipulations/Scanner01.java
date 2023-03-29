package day04stringmanipulations;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        //Example 1: Get the initials of a name which contains first name and last name
        //           Tom Hanks ==> TH
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first and the last name...");
        String fullName = input.nextLine();

        char first = fullName.charAt(0);
        char last = fullName.split(" ")[1].charAt(0);
        System.out.println(first + " - " + last);
    }
}