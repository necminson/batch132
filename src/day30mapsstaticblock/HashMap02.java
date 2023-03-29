package day30mapsstaticblock;

import java.util.HashMap;

public class HashMap02 {

    public static void main(String[] args) {

        String s = "Java, Java, I love Java.";

        System.out.println(getNumOfLetterOccurrence(s));

    }
    //Example 1: Create a method to display the number of occurrences of letters in a sentence
    //           Java, Java, I love Java. ==> J=3, a=6, v=4, I=1, l=1, o=1, e=1
    public static HashMap<String, Integer> getNumOfLetterOccurrence(String s){

        s = s.replaceAll("[^a-zA-Z]", "");

        HashMap<String, Integer> letterOcc = new HashMap<>();

        String[] letters = s.split("");

        for(String w : letters){

            Integer numOfOcc = letterOcc.get(w);

            if(numOfOcc==null){

                letterOcc.put(w, 1);

            }else{

                letterOcc.replace(w, numOfOcc+1);

            }
        }
        return letterOcc;
    }
}