package day21inheritance;

        /*
            1)Every Class except Object Class has Parent Class in Java
            2)Object Class is the Parent Class of all Classes in Java
            3)Just Object Class does not have any Parent Class in Java

            4)Java executes "Constructors" from top to bottom in inheritance
            5)To be able to execute "Constructors" from top to bottom, Java goes to the "Object Class"
              first by the help of the "super()" code.
            6)"super()" is for calling constructor from the first level "Parent Class"
            7)"super()" is located by Java into every "constructor" but it is being invisible.
            8)If you want to make it visible, you can type it explicitly.
            9)When you type "super()" explicitly, you have to type it into the first line inside the
              constructor.

            10)"this()" is for calling constructor from the class itself
            11)When you type "this()", you have to type it into the first line inside the constructor.
            12)"this()" and "super()" cannot be used in the same constructor together, because
               if you put anyone into the first line the other cannot be put into the first line.

            13)If a variable exist in a Class Java uses the variable from the class itself
            14)If a class does not have the requested variable in it, Java looks for the variable in the parent classes
            15)If you use "this" inside the constructor, it means you are calling a variable from the class itself
            16)If you use "super" inside the constructor, it means you are calling a variable from the first level parent class

            What is the difference between "this()" and "super()"?
            Answer:"this()" is for calling constructor from the class itself.
                   "super()" is for calling constructor from the first level parent class

            What is the difference between "this()" and "this"?
            Answer: "this()" is for calling constructor from the class itself.
                    "this" is for calling variable from the class itself.

            What is the difference between "super()" and "super"?
            Answer: "super()" is for calling constructor from the first level parent class
                     "super" is for calling variable from the first level parent class


            OOP Concept has 4 principals;
            1)Inheritance  (OK)
            2)Polymorphism = Method Overloading(OK) + Method Overriding(Not OK)
            3)Encapsulation (Not OK)
            4)Abstraction = Abstract Class(Not OK) + Interface(Not OK)
         */

public class Vehicle {

    public void move(){
        System.out.println("All vehicles move...");
    }

    public void price(){
        System.out.println("To buy a vehicle you should pay the price...");
    }

    public Vehicle() {
        super();
        System.out.println("Vehicle constructor...");
    }

    public Vehicle(String name){
        this();
        System.out.println("Vehicle constructor with String parameter");
    }
}