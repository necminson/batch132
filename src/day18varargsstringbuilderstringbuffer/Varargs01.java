package day18varargsstringbuilderstringbuffer;

public class Varargs01 {

        /*
            1)If you want to create a method works with any number of parameters, remember to use "Varargs"
            2)"Varargs" is a data structure uses "Arrays" behind that is why when you use "Varargs" you may think you are using "Arrays"
            3)Question: Can I use more than one "Varargs" in a method?
                        No I can't. Varargs cannot be made full, that is why Java cannot jump to the second parameter so second parameter will be "unreachable",
                        if you type "unreachable code" in anywhere Java will give you error.
            4)Question: Can I use another parameter after "Varargs" in a method?
                        No I can't. Varargs cannot be made full, that is why Java cannot jump to the second parameter so second parameter will be "unreachable",
                        if you type "unreachable code" in anywhere Java will give you error.
            5)Question: Can I use parameter before "Varargs" in a method?
                        Yes I can, using parameter/s before "Varargs" is possible.
            6)"varargs" can be declared like "int... v" or "int ...v". There is n o any other usage

                        Note: "Varargs" must be the last parameter in a method
         */

    public static void main(String[] args) {

        int r1 = add(3);
        System.out.println(r1);//3

        int r2 = add(3, 5);
        System.out.println(r2);//8

        int r3 = add(3, 5, 1, 2, 10);
        System.out.println(r3);//21

    }

    //Create a method to add any number of integers
    public static int add(int... v){

        int sum = 0;

        for(int w : v){
            sum = sum + w;
        }

        return sum;
    }

    //Create a method to add two integers
    public static int addTwoInt(int a, int b){
        return a+b;
    }

    //Create a method to add three integers
    public static int addThreeInt(int a, int b, int c){
        return a+b+c;
    }

    //Create a method to add four integers
    public static int addThreeInt(int a, int b, int c, int d){
        return a+b+c+d;
    }
}