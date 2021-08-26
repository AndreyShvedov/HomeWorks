package Lesson3;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int n = 0;
        int k = 20 / 2;
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) { //создание массива
            n = n + 2;
            arr[i] = n;
        }
        for (int i = 0; i < k; i++) { //вывод массива в строку
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < k; i++) { //вывод массива в столбик
            System.out.println(arr[i]);
        }
    }
}

