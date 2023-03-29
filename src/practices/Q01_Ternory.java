package practices;

public class Q01_Ternory {
    public static void main(String[] args) {

        // Type code check if a number is positive or not?
        // 1.way

        int x=23;
        if(x>0){
            System.out.println("Positive");

        } else {
            System.out.println("Negative");
        }
    // 2. way
        String result= x>0 ? "positive":"negative";
        System.out.println(result);

        // Type code to check if an integer has 3 digits or not?
        // "Boundary Value Analysis" >>> -1000, -999, 100, -99, 0, 99, 999,1000

        int y= -123;
        int absY= Math.abs(y);

       String result2= absY>99 && absY<1000 ? " It has 3 digits " : "It does not have 3 digits";
        System.out.println(result2);







    }

}
