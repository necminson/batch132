package day14multidimensionalarraysarraylists;

public class Md03 {

    public static void main(String[] args) {

        //Example 1: Find the sum of the minimum and maximum elements in a multidimensional array
        //           [ [5, 4], [10, 6, 7] ] ==> 4 + 10 = 14 ==> 14

        int a[][] = { {5, 4}, {10, 6, 7} };

        int small = a[0][0];
        int big = a[0][0];

        //[ [5, 4], [10, 6, 7] ]
        for(int[] w : a){
            for(int k : w){
                small = Math.min(small, k);
                big = Math.max(big, k);
            }
        }
        System.out.println(small);
        System.out.println(big);
        System.out.println(small + big);
    }
}