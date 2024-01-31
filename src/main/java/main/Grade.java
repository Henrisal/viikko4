package main;

import java.io.Serializable;

public class Grade implements Serializable{
    private String course;
    private int number;

    public Grade(String course, int number) {
        this.course = course;
        this.number = number;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getCourse() {
        return course;
    }
}
