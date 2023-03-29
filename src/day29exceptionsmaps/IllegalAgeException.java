package day29exceptionsmaps;

public class IllegalAgeException extends RuntimeException{

    public IllegalAgeException(String message){
        super(message);
    }

    public IllegalAgeException(){
        super();
    }

}