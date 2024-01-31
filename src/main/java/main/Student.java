package main;

import java.io.Serializable;
import java.util.ArrayList;


public class Student implements Serializable{

    private String name;
    private int snumber;
    private ArrayList<Grade> grades = new ArrayList<>();

    public Student (String name, int snumber) {
        this.name = name;
        this.snumber = snumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSnumber(int snumber) {
        this.snumber = snumber;
    }

    public String getName() {
        return name;
    }

    public int getSnumber() {
        return snumber;
    }

    public void addGrade(String course, int grade) {
        Grade newGrade = new Grade(course, grade);
        grades.add(newGrade);
    }

    public void listGrades() {
        for (Grade grade : grades){
            System.out.println(grade.getCourse()+": "+grade.getNumber());
        }
    }
    public ArrayList<Grade> getGrades() {
        return grades;
    }
    //addGrade(String course, int grade) – tallentaa kurssisuorituksen listaan

    
}
