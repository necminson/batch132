package day23encapsulationabstraction;

public class Student {

        /*
            1)When we type code, we may need to hide some data for some reasons.
              "Encapsulation" means "hiding data"
            2)After encapsulating a data, if you need you may "read" the value
              by using "get method"(getter)
            3)In getters;
                i)"Access Modifier" is "public"
                ii)"Return Type" must be the same with the "Data Type" of the variable
                iii)"Method Name" should have "get + <Variable Name>" structure
                    Note: If the data type of the variable is "boolean", make the "Method Name" structure like "is + <Variable Name>"
                iv)"Method Body" will have "return" keyword with the "Variable Name"
            4) After encapsulating a data, if you need you may "update" the value
               by using "set method"(setter)
            5)In setters;
                i)"Access Modifier" is "public"
                ii)"Return Type" must be "void"
                iii)"Method Name" should have "set + <Variable Name>" structure
                iv)setters use "parameters", the parameter will be the same with the variable
             6)If you want to create a "hidden", "updatable" but "not readable" variable: i)Make access modifier "private"
                                                                                          ii)Create set method for the variable
                                                                                          iii)Do not create get method for the variable
         */

    public String stdName;
    int stdGpa;
    private String psychologicalIssues = "Depression";
    private boolean success = true;

    public String getPsychologicalIssues() {
        return psychologicalIssues;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success){
        this.success = success;
    }

    public void setPsychologicalIssues(String psychologicalIssues) {
        this.psychologicalIssues = psychologicalIssues;
    }
}