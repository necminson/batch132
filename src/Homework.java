public class Homework {
    public static void main(String[] args) {

        System.out.println(addTwoIntegers(-23, 98));
        firstAndLastCharacter("Necmettin");
        sumOfAsciiValues("Kayseri");
    }

    //Create a method adds two integers
    public static int addTwoIntegers(int a, int b) {
        return a + b;
    }

    //Create a method prints the first and the last character on the console
    public static void firstAndLastCharacter(String str) {
        System.out.print(str.charAt(0) + " - ");
        System.out.println(str.charAt(str.length() - 1));

    }

    //Create a method prints the sum of the ASCII values of characters in a String
    public static void sumOfAsciiValues(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {

            sum += str.charAt(i);

        }
        System.out.println(sum);
    }

}
