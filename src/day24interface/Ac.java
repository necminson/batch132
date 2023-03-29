package day24interface;

public interface Ac {

     public abstract void cool();

     void heat();//Even I did not type "public" and "abstract" for the "heat()" it is "public" and "abstract"

     //1) By using "default" keyword before "return type" of the method, you can create "method with body" in an interface
     //2) When you create "bacteriaKiller() default method", "Honda Concrete Child Class" will not complain, because
     //   Overriding is mandatory for "abstract methods" but "bacteriaKiller() default method" is not abstract.
     //3) "default" in "bacteriaKiller() method" is not "access modifier", it is a new keyword to create "method with body" in an interface
     default void bacteriaKiller(){
          System.out.println("Ac's kill the bacteria %99.9...");
     }

     //If you need a "method with body" and access to it just by using "interface name" use "static" keyword.
     static void climate(){
          System.out.println("Climate settings are working...");
     }

     void run();

     //Variables are "final" in an interface as default, that is why when you create a variable you have to initialize.
     //Variables are "public" in an interface as default, that is why when you create a variable no need to declare it as "public".
     //Variables are "static" in an interface as default, that is why when you try to access to a variable no need to create an object use just interface name.
     int price = 2000;

        //Note: An interface may have "public" or "default" access modifier, you cannot use "protected" and "private" access modifiers same in "Classes"

}