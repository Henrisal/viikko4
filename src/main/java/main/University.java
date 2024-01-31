package main;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class University {
    final private String FILENAME;
    private ArrayList<Student> students = new ArrayList<>();
     public University() {
        FILENAME = "tiedot.txt";
     }


    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudent(int index) {
        return students.get(index);
    }

    public void listStudents() {
        for (Student student : students) {
            System.out.println(student.getSnumber()+": "+student.getName());
        }
    }

    public void listStudents2() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(i + ": " + students.get(i).getName());
        }
    }

    public void saveStudents() {
        try {
            ObjectOutputStream studentWriter = new ObjectOutputStream(new FileOutputStream(FILENAME));
            studentWriter.writeObject(students);
            studentWriter.close();
        } catch (IOException e) {
            System.out.println("Tallentaminen ei onnistunut");
            e.printStackTrace();
        }
    }

    public void loadStudents() {
        try {
            ObjectInputStream studentReader = new ObjectInputStream(new FileInputStream(FILENAME));
            students = (ArrayList<Student>) studentReader.readObject();
            studentReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lukeminen ei onnistunut");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Lukeminen ei onnistunut");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Lukeminen ei onnistunut");
            e.printStackTrace();
        }
    }


    //opiskelijat yliopistossa eli sama kuin animals ja Zoo

    // students-tietorakenteen kirjoittaminen tiedostoon ja lukeminen?
    
}
