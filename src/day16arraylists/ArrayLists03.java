package day16arraylists;

import java.util.Arrays;
import java.util.List;

public class ArrayLists03 {

    public static void main(String[] args) {

        //Example 1: Convert an Array to a List
        String a[] = new String[5];
        a[0]="Tom";
        a[1]="Ajda";
        a[2]="Cuneyt";
        a[3]="Angelina";
        a[4]="Brad";
        System.out.println(Arrays.toString(a));

        //Arrays.asList() method is used to create a List from an Array.
        //Arrays are fixed in length, when you create a List from an Array the List will be fixed in length as well.
        //Arrays gene will be transferred to the List.
        //So if you are sure, you will not need to change the size of the List you created from an Array, you can use asList
        //otherwise do not use it.
        List<String> myList = Arrays.asList(a);
        System.out.println(myList);

        //myList.remove("Ajda");
        //System.out.println(myList);//UnsupportedOperationException

        //myList.add("Rambo");
        //System.out.println(myList);//UnsupportedOperationException

    }
}
