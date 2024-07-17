package lk.ijse;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {
       Student student = new Student("Shanilka","Sahan");

        try (FileOutputStream fileOut = new FileOutputStream("student.json");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
