package main;

import java.util.ArrayList;
import java.util.Collections;

public class Calculator {

    public double getAverageGrade(Student s) {
        ArrayList<Grade> grades = s.getGrades();
        if (grades.isEmpty()) {
            return 0.0; // palauttaa 0, jos tyhjä
        }
        double total = 0;
        for (Grade grade : grades) {
            total += grade.getNumber();
        }
        return total / grades.size();
    }

    public double getMedianGrade(Student s) {
        ArrayList<Grade> grades = s.getGrades();
        if (grades.isEmpty()) {
            return 0.0;
        }
        ArrayList<Integer> gradeNumbers = new ArrayList<>();
        for (Grade grade : grades) {
            gradeNumbers.add(grade.getNumber());
        }
        Collections.sort(gradeNumbers);
        int size = gradeNumbers.size();
        if (size % 2 == 0) {
            int middleIndex = size / 2;
            return (gradeNumbers.get(middleIndex - 1) + gradeNumbers.get(middleIndex)) / 2.0;
        } else {
            return gradeNumbers.get(size / 2);
        }
    }
}



    //metodit

    //opiskelijan suoritteet (kurssit ja arvostana)

    //getAverageGrade(Student s)

    //getMedianGrade(Student s)
