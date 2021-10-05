package Lesson14;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> list = new ArrayList<>();
        list.add("lol");
        list.add("Lol");
        list.add("loL");
        list.add("pool");
        list.add("Ball");
        list.add("00000000");
        List<String> polyndromList;

        polyndromList = list.stream().filter(l -> l.toUpperCase()
                        .equals(new StringBuilder(l.toUpperCase())
                                .reverse().toString()))
                .collect(Collectors.toList());
        for (String l : polyndromList) {
            System.out.println(l);
        }

        list.stream().filter(l -> l.length() == 3).forEach(System.out::println);

        list.stream().map(String::length).forEach(System.out::println);

        Optional<String> sentence = list.stream().reduce((x, y) -> x + " " + y);
        System.out.println(sentence.get());

        int[] values = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
        
        var fos = new FileOutputStream("values.txt");
        try {
            for (int value : values) {
                fos.write(value);
            }
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileInputStream fis = new FileInputStream("values.txt");
        InputStreamReader ios = new InputStreamReader(fis, StandardCharsets.UTF_8);
        Integer b;

        try {
            while ((b = ios.read()) != -1) {
                System.out.println(b);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
