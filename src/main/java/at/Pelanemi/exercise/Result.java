package at.Pelanemi.exercise;

import java.util.ArrayList;
import java.util.List;

public class Result {

    public static void main(String[] args)
    {
        //Creating a List of type Integer using ArrayList
        List<Integer> list=new ArrayList<Integer>();
        //System.out.println("Hallo");
        //list = gradingStudents(List.of(1, 2, 3, 4, 5));
        list = gradingStudents(List.of(4, 73, 67, 38, 33));
        System.out.println(list);
    }

    public static List<Integer> gradingStudents(List<Integer> grades)
    {
        List<Integer> sortedGrades=new ArrayList<Integer>();
        int students = 0;
        int index = 0;

        students = grades.get(0);

        if(students>=1 && students<=60)
        {
            for(int grade:grades.subList(1, students+1))    //anstatt students+1 --> grades.size()) würde auch gehen
            {
                if(grade>=0 && grade<=100)
                {
                    if(grade<=37)
                        sortedGrades.add(grade);
                    else if((((grade/5)*5)+5 - grade) < 3)
                        sortedGrades.add(((grade/5)*5)+5);
                    else if((((grade/5)*5)+5 - grade) >= 3)
                        sortedGrades.add(grade);
                }
                else
                {
                    throw new IllegalArgumentException("Grade " + grade + " for grades out of range. Must be in 0..100");
                    //System.out.println("Grade " + grade + " out of range 0..100");
                }
            }
            System.out.println(students);
        }
        else {
            throw new IllegalArgumentException("Number " + students + " for students out of range. Must be in 1..60.");
            //ODER FOLGENDE VARIANTE:
            //System.out.println("Students " + students + " out of range 1...60");
            //return null;
        }

        return sortedGrades;
        //return List.of();


    }




}
