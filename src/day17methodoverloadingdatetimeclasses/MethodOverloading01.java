package day17methodoverloadingdatetimeclasses;

public class MethodOverloading01 {

        /*
            1)If you create methods with i)the same name and ii)different parameters, it means you created "method overloading"
            2)If you make method names and the parameters same in two different methods Java complains because
              if the names and the parameters are same, Java accepts the methods exactly same.
              Typing same methods repeatedly cannot be accepted by Java
            3)Java checks just the "method name" and "parameters" to understand if the methods are same or not.
              "method name" and "parameters" are called "method signature"
            4)How can we make the parameters different?
                i)Use different data types for the parameters
                ii)If data types are different you can change the order of the parameters
                iii)Change the number of parameters
            5)Access Modifiers do not take any role in "method overloading", that is why methods in any access modifier can be overloaded
            6)To be "static" or "non-static" does not affect "method overloading", that is why static and non-static methods
              can be overloaded
         */

    public static void main(String[] args) {

        multiply(3, 5);

        multiply(3, 3.2);

        multiply(3.2, 3);

    }

    //Create a method multiplies two integers
    public static int multiply(int a, int b){
        return a*b;
    }

    //Create a method multiplies one double and one integer
    protected static double multiply(double a, int b){
        return a*b;
    }

    //Create a method multiplies one int and one double
    private static double multiply(int a, double b){
        return a*b;
    }



    //Create a method multiplies three integers
    static int multiply(int a, int b, int c){
        return a*b*c;
    }

}