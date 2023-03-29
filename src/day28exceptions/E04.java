package day28exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class E04 {

        /*
                1)FileNotFoundException and IOException are CompileTime Exceptions because when we type code we are getting red underlines
                2)FileNotFoundException is related with "file path" and "file existence"
                3)IOException is related with all Input and Output Exceptions
                4)IOException is the parent of the FileNotFoundException
                  It means if you use IOException no need to use FileNotFoundException unless there is no specific requirement
                  If you use FileNotFoundException and IOException in multiple catch blocks, FileNotFoundException must be the first because it is child
         */

    public static void main(String[] args) throws IOException {

        readTextFile();

    }

    //Example 1:Create a method to read a text file.
    public static void readTextFile() throws IOException {

        FileInputStream fis = new FileInputStream("src/day28exceptions/MyText.txt");

        int k = 0;

        while((k=fis.read())!=-1){

            System.out.print((char)k);

        }

    }
}