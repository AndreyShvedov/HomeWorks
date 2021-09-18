package Lesson11;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        var words = new File("words");
        var polindroms = new File("polindroms");

        try {
            PrintWriter pw = new PrintWriter(words);
            pw.println("ror");
            pw.println("we");
            pw.println("wewewew");
            pw.println("wewewe");

            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        try {
            var pw1 = new PrintWriter(polindroms);
            var scanner = new Scanner(words);

            while (scanner.hasNextLine()) {
                String string = scanner.nextLine();
                var builder = new StringBuilder(string);

                if (builder.reverse().toString().equals(string)) {
                    pw1.println(string);
                }
            }
            pw1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
