package main.java.com.sishodiya.practice.core.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialMainClass {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId("14");
        student.setName("Ramcharan");

        try {
            FileOutputStream fos = new FileOutputStream("Student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
            oos.close();
            fos.close();
            System.out.println("Successfully saved into file");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
