package lk.ijse;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
       Student student = null;

        try (FileInputStream fileIn = new FileInputStream("student.json");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            student = (Student) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (student != null) {
            System.out.println("Name: " + student.name);
            System.out.println("Age: " + student.species);
        }
    }
}
