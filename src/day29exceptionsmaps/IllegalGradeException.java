package day29exceptionsmaps;

public class IllegalGradeException extends Exception{

    public IllegalGradeException(String message){
        super(message);
    }

    public IllegalGradeException(){
        super();
    }

}