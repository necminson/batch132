package day14multidimensionalarraysarraylists;

import java.util.Arrays;

public class Md01 {

    public static void main(String[] args) {

        //Example 1: Convert 2 dimensional array to 1 dimensional array
        //           [ [5, 3], [9, 8, 7] ] ==> [5, 3, 9, 8, 7]
        int a[][] = { {5, 3}, {9, 8, 7}, {10,11, 12, 13} };

        //1. Step: Find the number of elements in the multidimensional array
        int sum = 0;
        // [ [5, 3], [9, 8, 7] ]
        for(int[] w : a){
            sum = sum + w.length;
        }
        System.out.println(sum);//5

        //2. Step: Create new 1 dimensional array whose length is the same
        //         with number of elements in the multidimensional array
        int b[] = new int[sum];

        //3. Step: Transfer the elements from the multidimensional array to the 1 dimensional array
        int idx = 0;
        // [ [5, 3], [9, 8, 7] ]
        for(int[] w : a){
            for(int k : w){
                b[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}