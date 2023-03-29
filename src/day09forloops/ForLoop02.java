package day09forloops;

public class ForLoop02 {

    public static void main(String[] args) {

        //Example 1: Put * between 2 consecutive characters and to the end in a String.
        //           For example; "Java" ==> J*a*v*a*
        String s = "Java";
        for(int i=0;  i<s.length(); i++){
            System.out.print(s.charAt(i) + "*");
        }

        System.out.println();

        //Example 2: Type code to print unique characters in a String.
        //           Hello ==> Heo
        // CAUTION (!) : Interview question
        String t = "Hello";

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(t.indexOf(ch) == t.lastIndexOf(ch)){
                System.out.print(ch);
            }
        }
        System.out.println();
        //Example 3: Type code to print a String in reverse after removing spaces. For example; "Ali Can" ==> "naCilA"
        // CAUTION (!) : Most common interview question. Dont enter interview without learning this ex.

        String u="Ali Can";


        for (int i = u.length()-1;           i >=0 ;         i--) {
            char m =u.charAt(i);
            System.out.print(m);

        }
        System.out.println();
        //Example 4: Type code to find the sum of the integers from 3 to 7
        int sum = 0;
        for(int i=3; i<8; i++){
            sum = sum + i;
        }
        System.out.println(sum);

    }

}