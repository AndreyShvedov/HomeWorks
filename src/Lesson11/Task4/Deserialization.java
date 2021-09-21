package Lesson11.Task4;

import java.io.*;

public class Deserialization {
    public static void main(String[] args) {
        try (var ois = new ObjectInputStream(new FileInputStream("cars.bin"))) {
            var car1 = (CarTask4) ois.readObject();
            var car2 = (CarTask4) ois.readObject();
            System.out.println(car1);
            System.out.println(car2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
