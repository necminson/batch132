package day13arraysmultidimensionalarrays;

import java.util.Arrays;

public class Md01 {

    public static void main(String[] args) {


        //How to create a multidimensional array
        int arr[][] = new int[4][2];



        //How to print multidimensional array on the console
        System.out.println(Arrays.deepToString(arr));// [ [0, 0], [0, 0], [0, 0], [0, 0] ]

        //How to add elements into a multidimensional array
        arr[0][0]=3;
        arr[0][1]=10;

        arr[1][0]=61;
        arr[1][1]=5;

        arr[2][0]=2;
        arr[2][1]=11;

        arr[3][0]=81;
        arr[3][1]=23;
        System.out.println(Arrays.deepToString(arr));// [[3, 10], [61, 5], [2, 11], [81, 23]]

        //How to print the element of outer array
        System.out.println(Arrays.toString(arr[1]));// [61, 5]
        System.out.println(Arrays.toString(arr[2]));//[2, 11]
        System.out.println(Arrays.toString(arr[0]));// [3, 10]

        //How to print array elements one by one
        System.out.println(arr[2][1]);//11
        System.out.println(arr[1][0]);//61

        //How to use different number of elements in inner arrays
        int brr[][] = { {12, 45}, {33}, {76, 3, -21} };
        System.out.println(Arrays.deepToString(brr));// [ [12, 45], [33], [76, 3, -21] ]

        //Example 1: Type code to find the sum of all elements in an integer multidimensional array
        int crr[][] = { {5, 34}, {12, 98, -7} };

        int sum = 0;

        for(int[] w : crr){
            for(int u : w){
                sum = sum + u;
            }
        }
        System.out.println(sum);//142
    }
}