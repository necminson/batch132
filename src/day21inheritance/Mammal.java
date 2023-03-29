package day21inheritance;

public class Mammal extends Animal {

    public int age = 6;
    public boolean old = true;
    public char initial = 'A';

    public void feed(){
        System.out.println("Mammals feed with milk...");
    }

    public void drink(){
        System.out.println("Mammals drink...");
    }

}