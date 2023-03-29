package day08ternaryswitch;

import java.util.Scanner;

public class Switch03 {

    public static void main(String[] args) {

        //Example 1: Create a simple calculator which does addition, subtraction, multiplication, division, percentage calculation
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        double num1 = input.nextDouble();

        System.out.println("Enter second number");
        double num2 = input.nextDouble();

        System.out.println("Enter operation symbol: +, -, *, /, %");
        char operation = input.next().charAt(0);

        switch(operation){

            case '+':
                System.out.println("The sum is " + (num1+num2));
                break;
            case '-':
                System.out.println("The difference is " + (num1-num2));
                break;
            case '*':
                System.out.println("The multiplication is " + (num1*num2));
                break;
            case '/':
                System.out.println("The division is " + (num1/num2));
                break;
            case '%':
                System.out.println("The percentage is " + ((num1*num2)/100));
                break;
            default:
                System.out.println("This operation was not defined in this calculator");

        }

        /*
            Note 1: Inside the switch parenthesis, you can use i)int ii)byte iii)short iv)char v)String
            Nate 2: Inside the switch parenthesis, you CANNOT use i)long ii)float iii)double iv)boolean
         */
    }
}