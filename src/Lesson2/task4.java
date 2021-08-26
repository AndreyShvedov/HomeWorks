package Lesson2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.println("Введите значение A");
        var A = in.nextInt();
        System.out.println("Введите значение B");
        var B = in.nextInt();
        int P = 0;

        while (B > 0) {
            P = P + A;
            B--;
        }

        System.out.println("Произведение A*B = " + P);
    }
}

