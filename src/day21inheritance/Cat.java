package day21inheritance;

public class Cat extends Mammal {

    public int age = 14;
    public String name = "A";
    public boolean old = false;
    public double x = 2.3;

    public Cat(){
        System.out.println(this.age);//14
        System.out.println(super.age);//6
    }

    public void meow(){
        System.out.println("Cats meow...");
    }

}