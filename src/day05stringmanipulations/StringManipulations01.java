package day05stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Type code to check if the seventh character of a given String is "a" or not
        String s = "Alabama state";

        //1.Way:
        boolean result1 = s.charAt(6)=='a';//There are 2 tasks for Java
        System.out.println("Is the seventh character a? " + result1);// true

        //2.Way:
        boolean result2 = s.startsWith("a", 6);//There are 1 task for Java
        System.out.println("Is the seventh character a? " + result2);// true

        //Example 2: Type code to check if a String is ending with "money" or not

        String t = "Learn Java earn money";

        //1.Way:substring()
        boolean result3 = t.substring(t.length()-5).equals("money");
        System.out.println("Is the String ending with 'money'? " + result3);

        //2.Way:
        boolean result4 = t.endsWith("money");
        System.out.println("Is the String ending with 'money'? " + result4);

        //Example 3: Type code to convert "money" to "dollar"?
        //Note: When you use replace() method, create a new container to store updated data in it.
        String newT = t.replace("money", "dollar");

        System.out.println(t);//Learn Java earn money
        System.out.println(newT);// Learn Java earn dollar

        //Example 4: Type code to convert "a" to "*"?
        //Note: When you use replace("a", "*") method, all "a"s are converted to "*"
        //Note: You can use "char" and "Strings" in replace() method parenthesis.
        //      But both must be "char" or both must be "String", you cannot make one char, one String
        String t2 = t.replace('a', '*');
        System.out.println(t2);//Le*rn J*v* e*rn money

        String t3 = t.replace("earn", "win");
        System.out.println(t3);//Lwin Java win money

    }

}