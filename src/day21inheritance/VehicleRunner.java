package day21inheritance;

public class VehicleRunner {

    public static void main(String[] args) {

        Civic myCivic = new Civic(true);
        myCivic.move();
        myCivic.engine();
        myCivic.ecoSystem();
        int hashCode = myCivic.hashCode();
        System.out.println(hashCode);

    }

}