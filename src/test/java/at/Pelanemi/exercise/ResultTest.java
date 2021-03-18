package at.Pelanemi.exercise;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;  //@Test

import java.util.ArrayList;
import java.util.List;  //List.of

import static org.junit.jupiter.api.Assertions.assertEquals;    // assert Equals

public class ResultTest {

    @BeforeAll
    public static void init() {
        System.out.println("Testing Exercise1");
    }

    @AfterAll
    public static void finish() {
        System.out.println("Finished Testing Exercise1");
    }

    @Test   //Das Beispiel aus dem pdf getestet
    public void testGradingStudents()
    {
        assertEquals(List.of(75, 67, 40, 33), Result.gradingStudents(List.of(4, 73, 67, 38, 33)));
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




}
