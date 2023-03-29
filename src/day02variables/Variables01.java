package day02variables;

public class Variables01 {

    public static void main(String[] args) {

        //Variable/Object/Field Creation in Java.

        //Data Type   Variable Name    =   Value     ;
        int          age           =    7        ;

        //Example 1: Create a variable whose value is 1.99

        double priceOfPen = 1.99;

        /* Data Types
        1) int :We use "integer" data type for whole numbers. The minimum value of integer is -2,147,483,648
        and the maximum value for integer data type is 2,147,483,647
        Integer variables use 32 bits in memory.

        2) short: It is used for numeric values.The minimum value of short is -32,768 and maximum value is
        32,767. short variables uses 16 bits in memory.

        3) byte: It is used for whole numbers.The minimum value for byte is -128 and maximum value is 127. byte variables
        use 8 bits in memory.

        4) long: It is used for whole numbers. The minimum value for long is -9,223,372,036,854,755,808 and maximum value
        9,223,372,036,854,755,807. long variables use 64 bits in memory.

        Note:When you select any data type the value must be in the range of the declared data type

         */

        int populationOfGermany = 80000000;
        System.out.println(populationOfGermany);

        //Note:Java accepts long values as integer in default.But if your value is greater than the maximum value of
        // integers, you will get error and To fix that error you have to put "L" to the end of the numeric value.
        long populationOfWorld = 70000000000L;
        long populationOfChina= 1400000000;

        byte ageOfStu= 23;
        System.out.println(ageOfStu);

        short populationOfVillage= 23000;
        System.out.println(populationOfVillage);

        /*
        Data types for decimal values
        1)float: It is used for decimal values( like 12.99, 34.89)
           float values use 32 bits in memory

        When you create a float object, you have to use "f" or "F" at the end of the value.

        2) double: used for decimal values and it uses 64 bits in memory

        What is the value of double Max_value?

        positive 1.7976931348623157E+308
         */

        float priceOfShirt= 34.99f;
        double weightOfACell= 0.0000122345;

        /*
        Numeric data types in Java==> byte< short < int < long < float < double
        2 more data types;

        1) boolean==> has "true" or "false" values. boolean uses 1 bit in memory
        2) char ==> used for just a single character values ==> "a" or "K". It uses 16 bits in memory

         */
        boolean isRetired= false;
        boolean isOld= true;

        char initialOfFirstName= 'A';

    }

}