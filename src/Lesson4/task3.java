package Lesson4;

import java.util.Arrays;
import java.util.Random;

public class task3 {
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
        int p1 = 1;
        int p2 = 1;
        for (int i = 0; i < arr.length; i++) {  //вычисление произведений массива
            p1 = p1 * arr[i][i];
            p2 = p2 * arr[i][arr.length - 1 - i];
        }
        System.out.println(p1);
        System.out.println(p2);
        if (p1 > p2) {
            System.out.println("Произведение главной диагонали больше " + p1 + " > " + p2);
        } else if (p1 < p2) {
            System.out.println("Произведение второй диагонали больше " + p2 + " > " + p1);
        } else System.out.println("Произведения диагоналий равны");
    }
}

