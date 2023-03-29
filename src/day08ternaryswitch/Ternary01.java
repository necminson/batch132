package day08ternaryswitch;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1: Type code to select the minimum one of two integers
        int a = 12;
        int b = 12;

        int r1 = a<b ? a : b;
        System.out.println("Minimum one is " + r1);

        //Example 2: Type code to calculate absolute value of an integer
        //           5 ==> 5   -   0 ==> 0   -   -5 ==> -1*-5=5
        int c = 5;

        int r2 = c<0 ? -1*c : c; // We can write -c instead of -1*c
        System.out.println("Absolute value is " + r2);

        //Example 3: If two integers are positive return the multiplication
        //           Otherwise, give a message like "I do not know how to multiply"
        //           3 and 4 ==> 12   -   -3 and -4 ==> "I do not know how to multiply"   -  -3 and 4 ==> "I do not know how to multiply"
        int d = 3;
        int e = 4;

        //Object data type can be used for all data types as container
        Object r3 = d>0 && e>0 ? d*e : "I do not know how to multiply";
        System.out.println(r3);

    }

}