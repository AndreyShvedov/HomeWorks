package Lesson1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int a;
        int b;
        int c;
        int k1 = 0;
        int k2 = 0;
        System.out.print("Введите первое целое число: ");
        a = user_input.nextInt();
        System.out.print("Введите второе целое число: ");
        b = user_input.nextInt();
        System.out.print("Введите третье целое число: ");
        c = user_input.nextInt();
        if (a > 0) {
            k1 = k1 + 1;
        }
        if (b > 0) {
            k1 = k1 + 1;
        }
        if (c > 0) {
            k1 = k1 + 1;
        }
        System.out.println("Количество положительных чисел равно " + k1);
    }

}
