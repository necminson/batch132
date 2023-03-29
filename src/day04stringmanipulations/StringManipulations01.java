package day04stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Get the full name of the user and make all characters in upper cases

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first and the last name...");
        String fullName = input.nextLine().toUpperCase();

        //toUpperCase() method converts all characters to upper cases
        System.out.println(fullName);

        //Example 2: Get the full name of the user, make all characters in upper cases, and remove spaces
        //           from the beginning and from the end
        System.out.println("Enter your first and the last name...");
        String name = input.nextLine().toUpperCase().trim();//Method Chain

        //trim() method removes the "space" characters from the beginning and from the end.
        //trim() method does not touch spaces in the middle
        System.out.println(name);

        //Example 3: Get a String from a user, then count the number of characters in the String
        System.out.println("Enter a String...");
        String s = input.nextLine();

        int numOfChars = s.length();

        //length() method gives you the number of characters in a String
        System.out.println(numOfChars);
    }
}