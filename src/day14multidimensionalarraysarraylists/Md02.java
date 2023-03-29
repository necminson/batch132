package day14multidimensionalarraysarraylists;

public class Md02 {

    public static void main(String[] args) {

        //Example 1: Type code to find the multiplication of all elements of multidimensional array
        //           [ [5, 4], [10, 6, 3] ] ==> 3600

        int a[][] = { {5, 4}, {10, 6, 3} };

        int multiplication = 1;

        //[ [5, 4], [10, 6, 3] ]
        for(int[] w : a){
            for(int k : w){
                multiplication = multiplication * k;
            }
        }
        System.out.println(multiplication);
    }
}