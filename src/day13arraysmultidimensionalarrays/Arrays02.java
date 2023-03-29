package day13arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Example 1: Type code to check if a specific element exists in the array or not
        char ch[] = new char[5];
        ch[0] = 'A';
        ch[1] = 'Y';
        ch[2] = 'C';
        ch[3] = 'I';
        ch[4] = 'D';

        //1.Way:
        int counter = 0;

        for(char w : ch){
            if(w=='W'){
                counter++;
                break;
            }
        }

        if(counter>0){
            System.out.println("It exists");
        }else{
            System.out.println("It does not exist");
        }

        //2.Way:Use binarySearch() method tells you if the element exists or not in the array
        //      To use binarySearch() method, you have to use sort() first
        Arrays.sort(ch);

        //binarySearch() method gives you the index of existing element after sorting
        int idx1 = Arrays.binarySearch(ch, 'Y');
        System.out.println(idx1);//4

        int idx2 = Arrays.binarySearch(ch, 'C');
        System.out.println(idx2);//1

        int idx3 = Arrays.binarySearch(ch, 'X');
        System.out.println(idx3);// -5

        int idx4 = Arrays.binarySearch(ch, 'E');
        System.out.println(idx4);//-4

    }
}