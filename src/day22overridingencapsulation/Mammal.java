package day22overridingencapsulation;

public class Mammal extends Animal{

    public void feed(){
        System.out.println("Mammals feed their babies with milk...");
    }

    public Animal occur(){
        return new Mammal();
    }

}