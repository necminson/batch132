package day06stringmanipulationsifstatement;
import java.util.Scanner;

    public class IfStatement01 {
        /*
            If you study hard you will get offer soon
            Note: To execute our codes under some conditions we use "if-statement"
         */
        public static void main(String[] args) {
            //Example 1: If a number is positive, print "Positive" on the console
            int a = 0;
            //1.Way:
            if (a > 0) {
                System.out.println("Positive");
            }
            if (a < 0) {
                System.out.println("Negative");
            }
            if (a == 0) {
                System.out.println("neutral");
            }
            //2.Way:
            if (a > 0) {
                System.out.println("Positive");
            } else if (a < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Neutral");
            }
            //Example 2: Type code that prints day names for the given day numbers
            //           1 ==> Sunday, 2 ==> Monday, ... , 7 ==> Saturday
            Scanner input = new Scanner(System.in);
            System.out.println("Enter day number to see day name");
            byte dayNum = input.nextByte();
            if (dayNum == 1) {
                System.out.println("Sunday");
            } else if (dayNum == 2) {
                System.out.println("Monday");
            } else if (dayNum == 3) {
                System.out.println("Tuesday");
            } else if (dayNum == 4) {
                System.out.println("Wednesday");
            } else if (dayNum == 5) {
                System.out.println("Thursday");
            } else if (dayNum == 6) {
                System.out.println("Friday");
            } else if (dayNum == 7) {
                System.out.println("Saturday");
            } else {
                System.out.println("I told you to enter day numbers, are you good...");
            }


        }
    }

