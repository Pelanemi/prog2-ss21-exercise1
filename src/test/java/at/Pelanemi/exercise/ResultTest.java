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
        assertThrows(StudentsOutOfRange.class, () -> Result.gradingStudents(List.of(65, 73, 67, 38, 33)));    //2.Parameter: Funktion, deswegen Lambda, und gibt die Funktion zurück
    }

    @DisplayName("3. Size of first parameter too low")
    @Test
    public void testGradingStudents_sizeOfFirstParameterTooLow() {
        //Hier triggert im Code folgende Exception
        //System.out.println("Students " + students + " out of range 1...60");
        assertThrows(StudentsOutOfRange.class, () -> Result.gradingStudents(List.of(0, 73, 67, 38, 33)));
    }

    @DisplayName("4. One grade of list to high")
    @Test
    public void testGradingStudents_oneGradeOfListToHigh() {
        //Hier triggert im Code folgende Exception
        //System.out.println("Grade " + grade + " out of range 0..100");

    }

    @DisplayName("5. One grade of list to low")
    @Test
    public void testGradingStudents_oneGradeOfListToLow() {
        //Hier triggert im Code folgende Exception
        //System.out.println("Grade " + grade + " out of range 0..100");
    }

    @DisplayName("6. Expected array length - 1 of actual array")
    @Test
    public void testGradingStudents_comparationOfArrays() {

    }

    @DisplayName("7. Elements in coorect range")
    @Test
    public void testGradingStudents_rangeCheck() {


    }

    @DisplayName("8. Match of number of Students and grade elements")
    @Test
    public void testGradingStudents_matchOfStudentsAndGrades() {

    }

    @DisplayName("9. Check when 0 grades were passed in")
    @Test
    public void testGradingStudents_zeroCheck() {

    }

    @DisplayName("10. Check when negative grades were passed in")
    @Test
    public void testGradingStudents_negativeCheck() {

    }

    /*

    FOLGENDES NOCH IMPLEMENTIEREN !!!

    Wenn students n < 1 und oder > 60
            --> wirf eine exception aus

    Wenn ein grade < 0 oder >100
            --> wirf eine exception aus

    2,3 Tests mit Beispielen

    Anzahl des returnten Arrays soll gleich
    um 1 weniger sein als des übergebenen.

    sind alle Elemente in dem Array in der
    geforderten range

    stimmt die erste Stelle des Arrays
    mit der Anzahl der Noten überein

    gegen 0 prüfen

    gegen - prüfen
    */

    //wird der erster Eintrag korrekt ignoriert?



}
