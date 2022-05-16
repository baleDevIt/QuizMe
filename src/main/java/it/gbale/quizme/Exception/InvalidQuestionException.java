package it.gbale.quizme.Exception;

public class InvalidQuestionException extends Exception {

    public InvalidQuestionException() {
        super("Question is invalid - Please check your question");
    }

}
