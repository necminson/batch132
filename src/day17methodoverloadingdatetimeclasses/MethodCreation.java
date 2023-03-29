package day17methodoverloadingdatetimeclasses;

public class MethodCreation {

    public static void main(String[] args) {

        //Actual values used in method parenthesis are called "arguments"
        int r1 = addTwoInt(3, 5);
        System.out.println(r1);//8

        String r2 = getFirstLastChar("Angelina Jolie");
        System.out.println(r2);//Ae

        int r3 = getSumOfAsciisOfAllChars("Ajda");
        System.out.println(r3);//368

    }

    //Example 1: Create a method adds two integers
    //Variables used in method parenthesis are called "parameters"
    public static int addTwoInt(int a, int b){
        return a+b;
    }
    //Example 2: Create a method prints the first and the last character of a String on the console
    public static String getFirstLastChar(String s){
        return "" + s.charAt(0) + s.charAt(s.length()-1);
    }
    //Example 3: Create a method prints the sum of the ASCII values of characters in a String
    public static int getSumOfAsciisOfAllChars(String s){
        int sumOfAsciis = 0;
        for(int i=0; i<s.length(); i++){
            sumOfAsciis = sumOfAsciis + s.charAt(i);
        }
        return sumOfAsciis;
    }
}