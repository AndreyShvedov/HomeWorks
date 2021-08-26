package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class task6 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            arr[i] = r.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        int k = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[i] <= arr[i + 1]) {
                k++;
            }
        }
        if (k == 3) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }

        //ВТОРОЙ ВАРИАНТ МЕНЕЕ УНИВЕРСАЛЕН НЕ ПОДХОДИТ ДЛЯ БОЛЬШИХ МАССИВОВ
        if (arr[0] <= arr[1]) {
            if (arr[1] <= arr[2]) {
                if (arr[2] <= arr[3]) {
                    System.out.println("Массив является строго возрастающей последовательностью");
                } else {
                    System.out.println("Массив не является строго возрастающей последовательностью");
                }
            } else {
                System.out.println("Массив не является строго возрастающей последовательностью");
            }
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }

    }
}

