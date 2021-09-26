package Lesson12;

import java.util.Scanner;

public class ApplicationShop {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var start = new Application(scanner);
        start.start();
    }
}
