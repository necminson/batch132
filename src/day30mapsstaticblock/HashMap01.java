package day30mapsstaticblock;

import java.util.HashMap;

public class HashMap01 {

    public static void main(String[] args) {

        //String s = "Java is easy, Java is OOP, OOP makes Java easy.";

        String s = "Java, Java, I love Java";

        System.out.println(getNumOfOccurrence(s));

    }

    //Example 1: Type code to find the number of occurrences of words in a sentence
    //           Java is easy, Java is OOP, OOP makes Java easy. ==> Java=3, is=2, easy=2, oop=2, makes=1
    //           Java is easy, Java is OOP, OOP makes Java easy. ==> Java is easy Java is OOP OOP makes Java easy

    public static HashMap<String, Integer> getNumOfOccurrence(String s){// "Java, Java, I love Java"

        //To make "easy," and "easy." same, I removed punctuation marks
        s = s.replaceAll("\\p{Punct}", "");

        //To put the result into a map I created following HashMap
        HashMap<String, Integer> occurrences = new HashMap<>();

        //I split the String to get words then put them into the words array
        String[] words = s.split(" ");

        for(String w : words){

            Integer numOfOccurrences = occurrences.get(w);

            if(numOfOccurrences==null){
                occurrences.put(w, 1);
            }else{
                occurrences.replace(w, numOfOccurrences+1);
            }

        }
        return occurrences;
    }

}