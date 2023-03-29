package day23encapsulationabstraction;

public abstract class Animal {

        /*
            1) Sometimes we do not need method body, that is why we should not type it.
               If we do not type the "body part" the method will be "method without body” it means it is "abstract method"
            2) Other name of the "regular methods" is "concrete method", it means "method with body"
            3) "Concrete method"s focus on "How to do", "Abstract method"s focus on "What to do"
            4) When you create an "Abstract method" in parent class, the functionality will be mandatory for the child classes.
            5) If a functionality is not mandatory do not make it abstract make it concrete

            6)To make a method abstract
                i)Remove method body
                ii)Use abstract keyword between "access modifier" and "return type"
                iii)Change the "concrete class" to "abstract class" by using abstract keyword between "access modifier" and "class" keyword
                Note: After creating an abstract method do not forget to use the method in all "concrete" child classes.
                      If you do not use the method in all "concrete" child classes, you will get error.
             7)Implementing abstract methods from parent class to "abstract child classes" is optional,
               If you need implement it, if you do not need, do not implement it.
             8)You can use both "concrete method"s and "abstract method"s in "abstract class"es
             9)"final" methods must have "constant method body" but in abstraction every child class will use the "abstract method" with a different body.
               Because of that, Java does not let you make an abstract method "final".
               I mean "public final abstract void drink();" gives error.
             10)An "abstract class" cannot be "final" because; final class cannot have child classes but abstract class should have child classes
                to make "abstract method"s to be implemented in child classes.
             11)"abstract class"es can have "abstract methods", "abstract methods" are "uncompleted methods" because they do not have body part.
                If you create an object from an "abstract class" the object will have missing parts.
                I mean the object will not be perfect, if an object is not perfect it can create issues in the application.
                Because of that Java does not let you create object from an abstract class.
              12)"abstract class"es are classes, so they have "constructor" like other classes but the constructor cannot create object.
              13)We create "abstract method" for the child classes to use, but if you make the access modifier "private" it means
                 you do not want child classes to use it. This is contradiction, that is why Java does not let make an abstract method "private"
              14)An "abstract method" cannot be "static"
              15)Same rule in Overriding are valid for implementing abstract methods.
          */

    public abstract void eat();

    public void play(){
        System.out.println("Animals play..");
    }

}