package it.gbale.quizme.Exception;

public class InvalidEntityException extends Exception {
    @Override
    public String getMessage() {
        return super.getMessage() + " Invalid Entity ";
    }
}
