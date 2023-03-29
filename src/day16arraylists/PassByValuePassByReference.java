package day16arraylists;

public class PassByValuePassByReference {

        /*
            1)PassByValue creates a copy of the value and uses the copy in the method.
              That is why methods can change just the copy not original value.
              Java uses PassByValue to protect original values
            2)Some programming languages like C-Sharp use PassByReference.
              PassByReference creates the copy of the reference(address) and use the copy in the methods.
              Copy Reference and Original Reference point the original value that is why original is updated by the methods.
              I mean if you use PassByReference, you cannot protect original values.
         */

    public static void main(String[] args) {

        int shirtPrice = 100;
        studentShirtPrice(shirtPrice, 10);// 90
        System.out.println(shirtPrice);// 100

        String name = "Ajda";
        String result = putExclamation(name);
        System.out.println(result);//Ajda!
        System.out.println(name);//Ajda

        //Using a method inside the main method is called "Method Call"
        double newSalary = increaseSalary(20000);
        System.out.println(newSalary);//24000

        int abs = getAbsoluteValue(-5);
        System.out.println(abs);//5

    }

    public static void studentShirtPrice(int shirtPrice, int discount){
        int discountedPrice = shirtPrice - discount;
        System.out.println(discountedPrice);
    }

    public static String putExclamation(String name){
        return name + "!";
    }

    //Create a method increases the salary 20 percent
    public static double increaseSalary(double salary){
        return salary*1.2;
    }

    //Create a method calculates the absolute value of an integer
    // -5 ==> 5     -     5 ==> 5       -      0 ==> 0
    public static int getAbsoluteValue(int n){
        if(n<0){
            return -1*n;
        }else{
            return n;
        }
    }

    //Create a method adds two integers
    //Create a method prints the first and the last character on the console
    //Create a method prints the sum of the ASCII values of characters in a String
}