package day21inheritance;

public class Civic extends Honda {

    public void ecoSystem(){
        System.out.println("Using Civic is not expensive...");
    }

    public Civic() {
        super(2022);
        System.out.println("Civic constructor...");
    }

    public Civic(boolean hybrid){
        this();
        System.out.println("Civic constructor with boolean parameters");
    }
}