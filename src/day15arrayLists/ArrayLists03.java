package day15arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists03 {

    public static void main(String[] args) {

        /*
             Ask user to enter a letter
             If the letter exists in the list convert it to 'X'
             otherwise, add the element user entered into the list
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter...");
        char letter = input.next().charAt(0);

        List<Character> myList = new ArrayList<>();
        myList.add('J');
        myList.add('A');
        myList.add('V');
        myList.add('A');

        if(myList.contains(letter)){
            //If you use set() method for repeated elements, set() method updates just the first occurrence
            myList.set(myList.indexOf(letter), 'X');

        }else{

            myList.add(letter);
        }

        System.out.println(myList);

    }

}