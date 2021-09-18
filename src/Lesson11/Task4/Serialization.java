package Lesson11.Task4;


import java.io.*;

public class Serialization {
    public static void main(String[] args) throws FileNotFoundException {


        try (var oos = new ObjectOutputStream(new FileOutputStream("cars.bin"))){
            var car1 = new CarTask4("Geely", 100, 45000);
            var car2 = new CarTask4("GAZ", 85, 27000);
            oos.writeObject(car1);
            oos.writeObject(car2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
