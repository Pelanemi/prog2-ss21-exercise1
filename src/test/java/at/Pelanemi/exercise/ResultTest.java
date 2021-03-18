package at.Pelanemi.exercise;

import at.Pelanemi.exercise.exception.GradeOutOfRange;
import at.Pelanemi.exercise.exception.SizeMismatchException;
import at.Pelanemi.exercise.exception.StudentsOutOfRange;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;  //@Test

import java.util.Arrays;
import java.util.List;  //List.of

import static org.junit.jupiter.api.Assertions.*;


public class ResultTest {

    @BeforeAll
    public static void init() {
        System.out.println("Testing Exercise1");
    }

    @AfterAll
    public static void finish() {
        System.out.println("Finished Testing Exercise1");
    }

    @DisplayName("1. Testing a valid example")
    @Test   //Das Beispiel aus dem pdf getestet
    public void testGradingStudents()
    {
        assertEquals(List.of(75, 67, 40, 33), Result.gradingStudents(List.of(4, 73, 67, 38, 33)));
    }

    @DisplayName("2. Size of first parameter too high")
    @Test
    public void testGradingStudents_sizeOfFirstParameterTooHigh() {
        //Hier triggert im Code folgende Exception
        //System.out.println("Students " + students + " out of range 1...60");
        assertThrows(StudentsOutOfRange.class, () -> Result.gradingStudents(List.of(65)));    //2.Parameter: Funktion, deswegen Lambda, und gibt die Funktion zurück
    }

    @DisplayName("3. Size of first parameter too low")
    @Test
    public void testGradingStudents_sizeOfFirstParameterTooLow() {
        //Hier triggert im Code folgende Exception
        //System.out.println("Students " + students + " out of range 1...60");
        assertThrows(StudentsOutOfRange.class, () -> Result.gradingStudents(List.of(0)));   //Weil ich 0 Noten hab und es direkt fehlschlägt
    }

    @DisplayName("4. One grade of list to high")
    @Test
    public void testGradingStudents_oneGradeOfListToHigh() {
        //Hier triggert im Code folgende Exception
        //System.out.println("Grade " + grade + " out of range 0..100");
        assertThrows(GradeOutOfRange.class, () -> Result.gradingStudents(List.of(4, 150, 67, 38, 33)));
    }

    @DisplayName("5. One grade of list to low")
    @Test
    public void testGradingStudents_oneGradeOfListToLow() {
        //Hier triggert im Code folgende Exception
        //System.out.println("Grade " + grade + " out of range 0..100");
        assertThrows(GradeOutOfRange.class, () -> Result.gradingStudents(List.of(4, 50, -1, 38, 33)));
    }

    @DisplayName("6. Actual grade list must match first entry in list")
    @Test
    public void testGradingStudents_comparationOfArrays() {
        assertThrows(SizeMismatchException.class, () -> Result.gradingStudents(List.of(4, 150, 67, 38)));
    }

    @DisplayName("7. Check difference of 2 while subtracting")
    @Test
    public void testGradingStudents_checkDifferenceOfTwoWhileSubtracting() {
        List<Integer> input = List.of(4, 73, 67, 38, 33);
        List<Integer> expected = List.of(75, 67, 40, 33);

        List<Integer> output = Result.gradingStudents(input);
        assertEquals(expected, output);
        assertEquals(2, output.get(0) - input.get(1));
    }

    @DisplayName("8. Check difference of 1 while subtracting")
    @Test
    public void testGradingStudents_checkDifferenceOfOneWhileSubtracting() {
        List<Integer> input = List.of(4, 74, 67, 38, 33);
        List<Integer> expected = List.of(75, 67, 40, 33);

        List<Integer> output = Result.gradingStudents(input);
        assertEquals(expected, output);
        assertEquals(1, output.get(0) - input.get(1));
    }

    @DisplayName("9. Check if expected list has values of multiple 5")
    @Test
    public void testGradingStudents_zeroCheck() {
        List<Integer> input = List.of(4, 74, 68, 38, 30);
        List<Integer> expected = List.of(75, 70, 40, 30);

        List<Integer> output = Result.gradingStudents(input);
        assertEquals(expected, output);
        for(Integer grade : output) {
            assertEquals(0, grade % 5);
        }
    }


}
