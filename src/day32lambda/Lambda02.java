package day32lambda;

import java.util.stream.IntStream;

public class Lambda02 {

    public static void main(String[] args) {

        System.out.println(getSum(700, 100));
        System.out.println(getMultiplication(2, 11));
        System.out.println(getFactorial(-5));
        System.out.println(getSumOfEvensBetweenTwoIntegers(3,10));
        System.out.println(getSumOfDigitsOfIntegersInTheGivenRange(45, 47));

    }

    //1)Create a method to find the sum of integers from 7 to 100
    public static int getSum(int starting, int ending){
        if(starting>ending){
            int temp = starting;
            starting = ending;
            ending = temp;
        }
        return IntStream.rangeClosed(starting, ending).sum();
    }

    //2)Create a method to find the multiplication of the integers from 2(inc) to 11(inc)
    public static int getMultiplication(int starting, int ending){
        if(starting>ending){
            int temp = starting;
            starting = ending;
            ending = temp;
        }
        return IntStream.rangeClosed(starting, ending).reduce(Math::multiplyExact).getAsInt();
    }

    //3)Create a method to calculate the factorial of a given number.(5! = 1*2*3*4*5)
    public static int getFactorial(int number){
        if(number==0){
            return 1;
        }else if(number<0){
            number = Math.abs(number);
        }
        return IntStream.rangeClosed(1, number).reduce(Math::multiplyExact).getAsInt();
    }

    //4)Create a method to calculate the sum of even integers between given two integers
    public static int getSumOfEvensBetweenTwoIntegers(int starting, int ending){
        if(starting>ending){
            int temp = starting;
            starting = ending;
            ending = temp;
        }
        return IntStream.rangeClosed(starting, ending).filter(t->t%2==0).sum();
    }

    //5)Create a method to calculate the sum of digits of every integer between given two integers
    //  45 46 47 ==? 4+5+4+6+4+7 = 30
    public static int getSumOfDigitsOfIntegersInTheGivenRange(int starting, int ending){
        return IntStream.rangeClosed(starting, ending).map(Utils::getSumOfDigits).sum();
    }
}