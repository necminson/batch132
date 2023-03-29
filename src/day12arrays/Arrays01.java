package day12arrays;

import java.util.Arrays;

public class Arrays01 {

    /*
        1)primitive variables and Strings can store just a single data in them,
          sometimes we need "to store multiple data in the same data type" in a single container.
          To be able to store multiple data in a single container, Java created
          a new structure whose name is "Arrays"

        2)Arrays cannot store "non-primitives", if you see "non-primitives" were stored actually they are "references of non primitives"
          Arrays can store i)primitive data types and ii)references of the non-primitives
     */

    public static void main(String[] args) {

        int num = 12;
        String str = "Tom";

        //How to create an Array
        String sixthGraders[] = new String[5];

        //How to print an Array on the console
        System.out.println(sixthGraders);// [Ljava.lang.String;@3cb5cdba ==> This syntax gives the address of the array
        //                                  We need the array elements mostly, that is why we do not use this
        //                                  we use the following syntax
        System.out.println(Arrays.toString(sixthGraders));// [null, null, null, null, null]

        //How to add elements into an Array
        sixthGraders[1] = "Ali";
        sixthGraders[4] = "Angie";
        sixthGraders[0] = "Tom";
        sixthGraders[3] = "Mark";
        sixthGraders[2] = "Jim";
        System.out.println(Arrays.toString(sixthGraders));// [Tom, Ali, Jim, Mark, Angie]

        //How to print a specific element or elements from an array
        System.out.println(sixthGraders[1]);//Ali
        System.out.println(sixthGraders[0] + " - " + sixthGraders[4]);// Tom - Angie

        //How to find the number of elements in an Array
        int numOfElements = sixthGraders.length;
        System.out.println(numOfElements);//5

        //Example 1: Create a String Array, add 5 elements in it, type code to print
        //           the sum of the characters in the first and the last element on the console.
        //           Make your code dynamic
        String cities[] = new String[6];
        cities[0] = "Miami";
        cities[1] = "New York";
        cities[2] = "Istanbul";
        cities[3] = "Berlin";
        cities[4] = "Athena";
        cities[5] = "Frankfurt";

        int numOfCharInFirst = cities[0].length();
        int numOfCharInLast = cities[cities.length-1].length();

        System.out.println(numOfCharInFirst + numOfCharInLast);//11


        //Example 2: Create a String Array, add 5 elements in it, type code to print
        //           the sum of all characters in all element on the console.
        String names[] = new String[5];
        names[0] = "Brad Pitt";
        names[1] = "Cuneyt Arkin";
        names[2] = "Ajda Pekkan";
        names[3] = "Angelina Jolie";
        names[4] = "Silvester Stallone";
        System.out.println(Arrays.toString(names));

        //1.Way: Used for-loop
        int sum = 0;

        for(int i=0; i<names.length; i++){
            sum = sum + names[i].length();
        }
        System.out.println(sum);// 64

        //2.Way: Use for-each loop (Enhanced Loop)
        int total = 0;
        //[Brad Pitt, Cuneyt Arkin, Ajda Pekkan, Angelina Jolie, Silvester Stallone]
        for(String w : names){
            total = total + w.length();
        }
        System.out.println(total);

        //Note 1: "for-each loop" can be used with "Arrays" and "Collections", if there is no "Arrays" and "Collections" you cannot use
        //        "for-each loop", you have to use "for-loop" or "while loop" or "do while loop"

        //Note 2: Sometimes "for-each loop" cannot be used with "Arrays" and "Collections" as well.
        //        When using indexes is must, using "for-each loop" can be impossible
    }
}