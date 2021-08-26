package Lesson1;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Введите первое число: ");
        num1 = user_input.nextInt();
        System.out.print("Введите второе число: ");
        num2 = user_input.nextInt();
        if (num1 > num2) {
            System.out.println("Наибольшее число " + num1);
        } else {
            if (num1 < num2) {
                System.out.println("Наибольшее число " + num2);
            } else {
                System.out.println("Числа равны");
            }
        }

    }
}

