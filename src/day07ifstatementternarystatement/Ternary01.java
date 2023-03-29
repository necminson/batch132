package day07ifstatementternarystatement;

public class Ternary01 {
    public static void main(String[] args) {

        // Example 1: Type code to check if a number is even or not by using ternary
        int num=9;

        //1.Way: use if-else

        if (num%2==0) {
            System.out.println(num+" is even number");
        }else {
            System.out.println(num+" is odd number");

        }

        //2.Way : Use ternary
        //               Condition ?  The code will be executed  : The code executed
        //                                for true condition        for false condition
           String result= num%2==0 ?   num+" is even number"     : num+" is odd number";

        System.out.println(result);

        // Example 2: Type code to check if a number has 3 digits or not,use ternary.

        int num3= -237;
        num3=Math.abs(num3);
        String result3= num3>99&&num3<1000 ? num3+" is 3 digit number " : num3+" is not 3 digit number";
        System.out.println(result3);









    }
}
