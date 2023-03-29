package day06stringmanipulationsifstatement;
public class StringManipulation01 {
    public static void main(String[] args) {
        //Example 1: Type code to find the index of the first occurrence of 'a' in a given String
        //           Alabama ==> 2
        String s = "Alabama";
        //indexOf('a') will give you the index of first occurrence of 'a'
        int idxA = s.indexOf('a');
        System.out.println(idxA);// 2
        //Example 2: Type code to find the index of the first occurrence of 'java' in a given String
        //           "java is easy to learn, java is common in the market, java is OOP" ==> 0
        String t = "java is easy to learn, java is common in the market, java is OOP";
        //indexOf("java"); will give you the index of first character of the first occurrence of "java"
        int idxJava = t.indexOf("java");
        System.out.println(idxJava);
        //Note 1: If you use "non-existing character or characters" in indexOf() method, it will give you "-1"
        //Note 2: indexOf() method can be used with "char" and "String" data types
        //Example 3: Type code to find the index of the last occurrence of 'm' in a given String
        //           miami ==> 3
        String u = "miami";
        //lastIndexOf('m'); will give you the index of the last occurrence of 'm'
        int idxM = u.lastIndexOf('m');
        System.out.println(idxM);//3
        //Example 4: Type code to find the index of the last occurrence of 'earn' in a given String
        //           Learn Java earn money ==> 11
        String v = "Learn Java earn money";
        int idxEarn = v.lastIndexOf("earn");
        System.out.println(idxEarn);//11
        //Note 1: If you use "non-existing character or characters" in lastIndexOf() method, it will give you "-1"
        //Note 2: lastIndexOf() method can be used with "char" and "String" data types
        //Example 5:Type code to check if a given character is unique or not in a given String
        //          miami ==> 'a' --> Unique - 'i' --> Not unique
        String y = "miami";
        char ch = 'm';
        boolean r1 = y.indexOf(ch) == y.lastIndexOf(ch);
        System.out.println("Is the character unique? " + r1);
        /*
            Note: When you type code you should be careful about "coding standarts"
                  i)Separate "data" and the "main code"
        */
    }
}