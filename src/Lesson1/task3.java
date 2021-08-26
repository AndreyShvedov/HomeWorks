package Lesson1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int num;
        System.out.print("Введите целое число: ");
        num = user_input.nextInt();
        if (num > 0) {
            num = num + 1;
            System.out.println("Результат= " + num);
        } else {
            if (num < 0) {
                num = num - 2;
                System.out.println("Результат= " + num);
            } else {
                num = 10;
                System.out.println("Результат= " + num);
            }
        }

    }
}

