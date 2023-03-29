package day24interface;

public class Honda implements Ac, Engine {

    @Override
    public void cool() {
        System.out.println("AC cools well...");
    }

    @Override
    public void heat() {
        System.out.println("AC heats well...");
    }

    @Override
    public void run() {
        System.out.println("Engines run...");
    }

    /*
        1)A parent class may have too many methods, but putting too many methods in a single class
          will make the parent class so huge. Creating huge structures in Java is not good, we should
          create as possible as atomic structure.
        2)To prevent huge parent class we can group the methods and put them in different classes but
          that needs multiple parent classes. Java does not support multiple inheritance.
        3)Multiple inheritance is not supported for classes, if you use "interfaces" as parents Java will
          let you create multiple parents for a class.
          As a summary, multiple inheritance is allowed for interfaces.

        4)If you use a huge parent class, when any part is broken in the huge parent class the structure will be down.
          But if you create multiple small parents when any prent is broken just a small functionality will be down.
          This is preferable.
        5)If you make a class dependent on another class completely(Tight Coupling) when the other class is broken your class
          will be broken as well, this is not good. That is why we prefer to create almost independent classes, this structure is called
          Loose Coupling.

        6)Interfaces are "fully abstract", I mean "Interfaces" cannot have concrete methods, all methods in an interface
          must be abstract method. As you know "abstract methods" must be implemented by "concrete child classes", If you want a developer
          not to forget any "mandatory functionalities" to implement for a child class, using interfaces is perfect.
          We name an interface as "To do list" for the child classes

        7)To make an "Interface" parent of a "Concrete Class" use "implements" keyword instead of "extends"
          To make an "Interface" parent of an "Abstract Class" use "implements" keyword instead of "extends"
          To make an "Interface" parent of another "interface" use "extends" keyword.
          To make a "class" parent of another "class" use "extends" keyword.
          *To make a "class" parent of an "interface" is impossible

          Interface(Parent) --> Class(Child): implements
          Interface(Parent) --> Interface(Child): extends
          Class(Parent) --> Class(Child): extends
          Class(Parent) --> Interface(Child): This is impossible

        8)Methods in an interface are "public" and "abstract", that is why no need to type "public" and "abstract" when you create a method

        9)Interfaces do not have "constructor" that is why you cannot create object from an interface.
          As you remember, we cannot create object from "abstract class" as well.
          But "abstract classes" have constructor, the constructor cannot create object.

          As a summary; abstract structures cannot give you object.

        10)Do not make an "abstract method" "static" because, "static" methods cannot be overridden but "abstract methods" are created to override.
           So do not try to make any method in an interface "static"

        11)It is allowed to create methods with the same name in different parent interfaces.
           But if you create methods with the same name in different parent interfaces, make
           "parameters" and "return types" same as well.

     */
}