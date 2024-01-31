package main;

import java.util.ArrayList;
import java.util.Collections;

public class Calculator {

    public double getAverageGrade(Student s) {
        ArrayList<Grade> grades = s.getGrades();
        if (grades.isEmpty()) {
            return 0.0; // Return 0 if there are no grades
        }
        double total = 0;
        for (Grade grade : grades) {
            total += grade.getNumber();
        }
        return total / grades.size(); // Calculate and return the average
    }

    public double getMedianGrade(Student s) {
        ArrayList<Grade> grades = s.getGrades();
        if (grades.isEmpty()) {
            return 0.0; // Return 0 if there are no grades
        }
        ArrayList<Integer> gradeNumbers = new ArrayList<>();
        for (Grade grade : grades) {
            gradeNumbers.add(grade.getNumber());
        }
        Collections.sort(gradeNumbers); // Sort the grades
        int size = gradeNumbers.size();
        if (size % 2 == 0) {
            // If the number of grades is even, calculate the average of the middle two grades
            int middleIndex = size / 2;
            return (gradeNumbers.get(middleIndex - 1) + gradeNumbers.get(middleIndex)) / 2.0;
        } else {
            // If the number of grades is odd, return the middle grade
            return gradeNumbers.get(size / 2);
        }
    }
}



    //metodit

    //opiskelijan suoritteet (kurssit ja arvostana)

    //getAverageGrade(Student s)

    //getMedianGrade(Student s)
