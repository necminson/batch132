package day04stringmanipulations;

public class StringManipulations03 {

    public static void main(String[] args) {

       /*
       Example 1: Check the password if it has given rules.
                    ı   It should start with "J"
                    ıı  It should have at least 8 characters
                    iii Last 3 characters should be "AVA"
        */


        String psw = "J!+5AVA";
        boolean first = psw.startsWith("J"); // First rule is valid.
        boolean second = psw.length()>7; // Second rule is valid.
        boolean third = psw.endsWith("AVA");// Third rule is valid.
        boolean result = first&&second&&third;
        System.out.println(result);


    }




}
