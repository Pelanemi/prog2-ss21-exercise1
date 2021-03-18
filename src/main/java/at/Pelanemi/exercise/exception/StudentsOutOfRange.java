package at.Pelanemi.exercise.exception;

public class StudentsOutOfRange extends RuntimeException{
    public StudentsOutOfRange(String message) {
        super(message);
    }
}
