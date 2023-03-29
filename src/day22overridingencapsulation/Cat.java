package day22overridingencapsulation;

public class Cat extends Mammal{

    @Override //Override Annotation ==> Checks the overriding rules
    public void eat() {// Overriding Method
        System.out.println("Cats eat...");
    }

    @Override
    public Mammal create() {
        return new Cat();
    }

    @Override
    public Mammal occur() {
        return new Cat();
    }

    @Override
    public Integer number() {
        return 456;
    }

    @Override
    public int num() {
        return 24;
    }
}