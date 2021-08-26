package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class task5 {
    public static void main(String[] args) {
        var arr1 = new int[5];
        int[] arr2;
        arr2 = new int[5];
        Random r = new Random();
        for (int i = 0; i < 5; i++) { // создание 1-го массива
            arr1[i] = r.nextInt(15);
        }
        for (int i = 0; i < 5; i++) { // создание 2-го массива
            arr2[i] = r.nextInt(15);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        double s1 = 0;
        double s2 = 0;
        double sr2;
        for (int i = 0; i < 5; i++) { // вычисление среднего арифмитического 1-го массива
            s1 = s1 + arr1[i];
        }
        double sr1 = s1 / 5;
        for (int i = 0; i < 5; i++) { // вычисление среднего арифмитического 2-го массива
            s2 = s2 + arr2[i];
        }
        sr2 = s2 / 5;
        if (sr1 > sr2) {
            System.out.println("Среднее арифметическое больше в 1-ом массиве " + sr1 + " > " + sr2);
        } else if (sr1 < sr2) {
            System.out.println("Среднее арифметическое больше во 2-ом массиве " + sr2 + " > " + sr1);
        } else {
            System.out.println("Средние арифметические в массивах равны" + sr1 + " = " + sr2);
        }
    }
}

