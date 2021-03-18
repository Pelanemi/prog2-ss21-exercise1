package at.Pelanemi.exercise.exception;

public class GradeOutOfRange extends RuntimeException {
    public GradeOutOfRange(String message) {
        super(message);
    }
}
