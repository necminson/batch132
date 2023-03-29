package day21inheritance;

public class Honda extends Vehicle {

    public void engine(){
        System.out.println("Honda uses perfect engine...");
    }

    public void brake(){
        System.out.println("Honda stops securely...");
    }

    public Honda() {
        super();
        System.out.println("Honda constructor...");
    }

    public Honda(int year){
        super("A");
        System.out.println("Honda constructor with int parameter");
    }
}