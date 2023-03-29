package day22overridingencapsulation;

public class Student {

        /*
            1)When we type code, we may need to hide some data for some reasons.
              "Encapsulation" means "hiding data"
            2)After encapsulating a data, if you need you may read the value
              by using "get method"(getter)
         */

    public String stdName;
    int stdGpa;
    private String psychologicalIssues = "Depression";

    public String getPsychologicalIssues(){
        return psychologicalIssues;
    }

}