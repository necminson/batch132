package day09forloops;

public class ForLoop01 {

    public static void main(String[] args) {

        //Example 1: Type all integers from 11 to 44 "in the same line" with a space between consecutive integers
        //           11 12 13 14 ... 44
        for(int i=11; i<45; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        //Example 2: Type "even integers" from 11 to 44 in the same line with a space between consecutive integers
        for(int i=11; i<45; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //Example 3: Type "odd integers" from 68 to 13 in the same line with a space between consecutive integers
        for(int i=68; i>64; i--){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //Example 4: Type code to print the letters from 'c' to 'u'
        //           c d e f ... u
        for(char i='c'; i<'v'; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        //Example 5: Type code to print integers from 0 to 100 without using any number in your code
        // Caution (!): This example is very common interview question
        for(int i='a'-'a'; i<'e'; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        /*
            We can use "int" as data type for char data
            If you use "char" as data type for "char"s Java gives you the character
            If you use "int" as data type for "char"s Java gives you the ASCII value of the char
         */
        char ch = 'm';
        System.out.println(ch);// m

        int dh = 'm';
        System.out.println(dh);// 109

        char fh =109;
        System.out.println(fh);
    }
}