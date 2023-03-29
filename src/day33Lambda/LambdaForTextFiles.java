package day33Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaForTextFiles {

    public static void main(String[] args) throws IOException {

        //How to access a text file and print the text on the console

        Files.
                lines(Paths.get("src/day33Lambda/MyTextFile")).
                forEach(System.out::println);

        System.out.println("==========");

        //Convert all characters in the text file to uppercase then print the text on the console
        Files.
                lines(Paths.get("src/day33Lambda/MyTextFile")).
                map(String::toUpperCase).
                forEach(System.out::println);

        System.out.println("==========");

        //Check if the text file has word "Java" in it
        boolean r1 = Files.
                lines(Paths.get("src/day33Lambda/MyTextFile")).
                anyMatch(t->t.contains("Java"));
        System.out.println(r1);

        System.out.println("==========");

        //Print distinct words on the console in the file
        Files.
                lines(Paths.get("src/day33Lambda/MyTextFile")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                distinct().
                forEach(System.out::println);

        System.out.println("==========");

        //Get the words which end with "s" and print them on the console
        Files.
                lines(Paths.get("src/day33Lambda/MyTextFile")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.endsWith("s")).
                forEach(System.out::println);

        System.out.println("==========");

        //Get the words distinctly, convert them to lowercase and print them on the console in reverse order
        Files.
                lines(Paths.get("src/day33Lambda/MyTextFile")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                map(t->t.replaceAll("[^a-zA-Z]","")).
                map(t->t.toLowerCase()).
                distinct().
                sorted(Comparator.reverseOrder()).
                forEach(System.out::println);

        System.out.println("==========");

        //Find the total number of letters used in the text file
        int r2 = Files.
                lines(Paths.get("src/day33Lambda/MyTextFile")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                map(t->t.replaceAll("[^a-zA-Z]", "")).
                map(t->t.length()).
                reduce(Math::addExact).
                get();
        System.out.println(r2);


    }
}