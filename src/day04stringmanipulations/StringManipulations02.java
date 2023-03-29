package day04stringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        //Example 1: Get the first 4 characters from a String and convert them to lower cases
        //           Albania ==> Alba ==> alba
        String s = "GERMANY";
        String t = s.substring(0,4).toLowerCase();
        System.out.println(t);

        //Example 2: Check if two Strings are same or not?
        String r = "Java";
        String u = "java";

        boolean same = r.equals(u);
        System.out.println(same);//false because values are different

        boolean sameIgnoreCases = r.equalsIgnoreCase(u);
        System.out.println(sameIgnoreCases);//true

        //Question: Why don't we use "==" to compare Strings?
        //1.Scenario: "==" and "equals()" gives you the same output
        String k = "Java";
        String m = "java";

        boolean f1 = k==m;
        System.out.println(f1);

        boolean f2 = k.equals(m);
        System.out.println(f2);

        //2.Scenario: "==" and "equals()" gives you the same output
        String s1 = "TechPro";
        String s2 = "TechPro";

        boolean r1 = s1==s2;
        System.out.println(r1);

        boolean r2 = s1.equals(s2);
        System.out.println(r2);

        //3.Scenario: "==" and "equals()" gives you different output
        String t1 = "Python";
        String t2 = new String("Python");

        boolean d1 = t1==t2;
        System.out.println(d1);

        boolean d2 =t1.equals(t2);
        System.out.println(d2);
    }
}