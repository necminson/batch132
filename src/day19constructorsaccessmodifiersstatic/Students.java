package day19constructorsaccessmodifiersstatic;

public class Students {

    /*
        1)We need "constructor" to create an object from a class.
        2)When we create a class Java puts a constructor in it, because Java knows classes are for creating objects.
        3)When we create a class you will not see any constructor in it, but the class has constructor, it is invisible constructor.
        4)Invisible constructors are called "Default Constructor"
        5)To create a constructor follow the steps;
            i)Use access modifier mostly we use "public" access modifier
            ii)Use class name as constructor name
            iii)Open close constructor parenthesis
            iv)Open close curly braces
        6)When you create constructor manually Java will delete the "default constructor"
        7)We can create many constructors in a class
            i)Constructors names will be same  because every constructor uses class name as name
            ii)Every constructor must have different parameters
        8)What are the differences between "Method" and the "Constructor"?
            i)"Method"s have "return type" but "Constructors" do not have
            ii)"Method"s are for some actions, "Constructor"s are for object creation
     */
    public String stdName;
    public int age;
    public boolean success;
    public String gender;


    //Default constructor is the same with the following constructor
    public Students(){

    }

    //Create a constructor uses all variables
    public Students(String stdName, int age, boolean success, String gender){
        this.stdName = stdName;
        this.age = age;
        this.success = success;
        this.gender = gender;
    }

    //Create a constructor uses some of the variables
    public Students(String stdName, int age, boolean success){
        this.stdName = stdName;
        this.age = age;
        this.success = success;
    }

    //Create constructor by using IntelliJ
    public Students(String stdName, int age) {
        this.stdName = stdName;
        this.age = age;
    }

    public Students(String stdName, String gender) {
        this.stdName = stdName;
        this.gender = gender;
    }
}