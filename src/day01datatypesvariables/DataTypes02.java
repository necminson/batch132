package day01datatypesvariables;

public class DataTypes02 {

    /*
    What is "Data"?
    Data is used,is stored, is processed in Java.

    What are the "Data Types" in Java?
    There are 2 main Data Types in Java: i) primitive data types  ii) non-primitive data types

    What are the "primitive data types" ?
    i) "primitive data types" were created by Java, developers can not create "primitive data types".
    ii) There are 8 "primitive data types":
                1.byte  2.short 3.int   4.long  5.float 6.double    7.char  8.boolean

     !!!  Naming Convention of Variables:
                i) Start with lowercase
                ii) All words except the first should start with uppercase
             This is called "Camel Case"

    1) byte :    "byte " is for "whole numbers".
                 "byte " is from -128 to 127.

                    let's create a byte variable and assign it
       */
       // byte stdAge =13;
        /*
        when we type "byte stdAge" i) goes memory and creates reserved area and
                                   ii) name it as "stdAge" and
                                   iii) puts zero (default value) in reserved area
                                   !! zero is default value for every numeric data types.
       "then puts the value 13 in it and end the "statement" by ";"
        we are not allowed to put 130 as value for "byte" data type.
             !!  " = " in Java is "assignment operator" " == " is equality in Java.
    */
    /*    2) short :    "short " is for "whole numbers".
            "short " is from -32K sth to +32K sth.

    let's create a short variable and assign it
            */
  //  short populationInAnApartment =546;

    /*    3) int : "int " is stands for "integer" and it is for "whole numbers".
            "int " is from -2 billion sth to +2 billion sth.

    let's create a int variable and assign it
            */
  //  int populationInACity =650000;

    /*    4) long : "long "  it is for "whole numbers".


    let's create a long variable and assign it
            */
  //  long populationOfTheWorld =72000000000;
 //   long populationOfTheContinent= 2000000;
 //   long populationOfTheWorld01 =72000000000L;
    /*
    ATTENTION !  When we give a value for "long" type variable, Java  will receive it as integer
                 to protect to memory usage. That's why 72000000000 is underlined to accept as error.
                 but 2000000 is not underlined.Because 2000000 is in "int" arrange.
                if we are determined to give value for "long" data type we should write "L" or "l" at the end.
     */
     /*    5) double : "double "  it is for "decimal numbers".
            "doubles " can have up to 16 digits in decimal part, it is so sensitive

    let's create a double variable and assign it
            */
    //        double weightOfACell=0.000000000345;

    /*    6) float : "float "  it is for "decimal numbers".
           "float " can has up to 7 digits in decimal part.

   let's create a float variable and assign it
           */
 //   float shirtPrice =0.0000345;
//    float shirtPriceA =0.34F;
    /*
    ATTENTION !  When we give a value for "float" type variable, Java  will receive it as double
                 That's why 0.0000345 is underlined to accept as error.
                 if we are determined to give value for "float" data type we should write "F" or "f" at the end.

    !!!!    Almost all developer use "double" to not to write "f" at the end     !!!!


                        UP TO NOW WE LEARNED "NUMERIC DATA TYPES"

     */

    /*    7) char : "char "  for "single characters".
                    A,?,!,s,3 etc.
                    The value of "char data type" must be the between the single quotes.
                    ====> instead os S ve write 'S'

   let's create a char variable and assign it
           */
//    char initial ='S';
//    char punctuationMark='!';
    /*    8) boolean : "boolean "  for "true" or "false" answers.


   let's create a boolean variable and assign it
           */
  //          boolean isRetired=true;
 //           boolean isOld=false;
    /*
    What did we learn today
    1) How to create "project","package","class","variable"
    2) How to name "project","package","class","variable"
    3) Data Types.
    4) Primitive data types.
     */





}
