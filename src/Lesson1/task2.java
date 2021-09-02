package Lesson1;

import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("Введите длину первой стороны треугольника: ");
        a = user_input.nextInt();
        System.out.print("Введите длину второй стороны треугольника: ");
        b = user_input.nextInt();
        System.out.print("Введите длину третьей стороны треугольника: ");
        c = user_input.nextInt();
        if (a > (b + c) | b > (a + c) | c > (a + b)) {
            System.out.println("Такого треугольника не существует");
        } else {
            System.out.println("Такой треугольника существует");
        }
    }
}