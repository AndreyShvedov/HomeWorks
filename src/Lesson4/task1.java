package Lesson4;

import java.util.Arrays;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        var r = new Random();
        for (int i = 0; i < arr.length; i++) {  //создание массива
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(10);
            }
        }
        for (int[] ints : arr) {  //вывод массива
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {  //вычисление суммы
            if (arr[i][i] % 2 == 0) {
                sum = sum + arr[i][i];
            }
        }
        System.out.println("Сумма четных чисел главной диагонали = " + sum);
    }
}
