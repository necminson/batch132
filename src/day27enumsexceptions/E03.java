package day27enumsexceptions;

public class E03 {

    public static void main(String[] args) {

        String s1 = "Java";
        System.out.println(getNumOfCharsInString(s1));//4

        String s2 = "";
        System.out.println(getNumOfCharsInString(s2));//0

        String s3 = " ";
        System.out.println(getNumOfCharsInString(s3));//1

        String s4 = null;
        System.out.println(getNumOfCharsInString(s4));//NullPointerException
        //Some methods in String Class create issue when you used them with null
        //Java throws NullPointerException for this issue

        String s = "123";
        System.out.println(convertStringToInt(s) + 2);//125

        String t = "1a2b";
        System.out.println(convertStringToInt(t) + 2);//NumberFormatException ==> For input string: "1a2b"
        //If you try to convert a String contains non-digit characters to a number
        //Java throws NumberFormatException

    }

    //Example 1: Create a method to get the number of characters in a String
    public static int getNumOfCharsInString(String s){
        try {
            return s.length();
        }catch(NullPointerException e){
            return 0;
        }
    }

    //Example 2: Create a method to convert a String to an integer
    public static int convertStringToInt(String s){

        try {

            return Integer.valueOf(s);

        }catch(NumberFormatException e){

            System.out.println(s + " has non-digit characters");
            System.out.println(e.getMessage());//To see technical message from Java use getMessage() method
            e.printStackTrace();//To get detailed error message use printStackTrace() method

            return 0;

        }
    }

}