package day07ifstatementternarystatement;

public class IfStatement01 {
    public static void main(String[] args) {

    // Example 1 Type code to check if a given character is uppercase or lowercase or others
    char ch = '?';
        if (ch>='A' && ch<='Z') {
            System.out.println(ch+" is uppercase");
        } else if (ch>='a' && ch<='z') {
            System.out.println(ch+" is lowercase");
        }else {
            System.out.println(ch+" is not a letter");
        }

        // Example 2: If a number is less than 300 or greater than 3000
        //            print "Perfect Number" on the console, otherwise
        //            print "Regular Number" on the console

        int x =3001;
        if (x <300 || x>3000) {
            System.out.println(x + " is Perfect Number");
        }else{
            System.out.println(x + " is Regular Number");
        }

        // Example 3: Type code to check if a number is "even" or "odd"

        int y= 8;
        if (y%2 == 0) {
            System.out.println(y+ " is an even number");
        } else {
            System.out.println(y+ " is an odd number");
        }

        // Example 4: Type code to print the number of month for the given month name
        // February --->   May ----> 5      December ----> 12      Tom ----> Invalid month name

        String monthName= "March";
        if (monthName.equalsIgnoreCase("January") ) {
            System.out.println(1);
        } else if (monthName.equalsIgnoreCase("February")) {
            System.out.println(2);
        } else if (monthName.equalsIgnoreCase("March")) {
            System.out.println(3);
        } else if (monthName.equalsIgnoreCase("April")) {
            System.out.println(4);
        } else if (monthName.equalsIgnoreCase("May")) {
            System.out.println(5);
        }else if (monthName.equalsIgnoreCase("June")) {
            System.out.println(6);
        } else if (monthName.equalsIgnoreCase("July")) {
            System.out.println(7);
        } else if (monthName.equalsIgnoreCase("August")) {
            System.out.println(8);
        } else if (monthName.equalsIgnoreCase("September")) {
            System.out.println(9);
        } else if (monthName.equalsIgnoreCase("October")) {
            System.out.println(10);
        } else if (monthName.equalsIgnoreCase("November")) {
            System.out.println(11);
        } else if (monthName.equalsIgnoreCase("December")) {
            System.out.println(12);
        } else {
            System.out.println("Invalid Month day");
        }





    }



}
