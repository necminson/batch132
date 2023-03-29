package practices;

import java.util.Scanner;

public class Q02_Switch {

    public static void main(String[] args) {

        // Ask user enter e character , if it is vowel print "Vowel" or not print "Not vowel?

        Scanner input=new Scanner(System.in);
        System.out.print("Enter a latter to check if it is vowel or not : " );
        char ch = input.next().toLowerCase().charAt(0);
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 'x':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'y':
            case 'z':

                System.out.println("Not vowel");
                break;
            default:
                System.out.println("Enter a letter , not character");

        }










    }
}
