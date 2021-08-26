package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        Random r = new Random();
        for (int i = 0; i < 15; i++) {
            arr[i] = r.nextInt(99);
        }
        System.out.println(Arrays.toString(arr));
        int k = 0;
        for (int j = 0; j < 15; j++) {
            if (arr[j] % 2 == 0) {
                k = k + 1;
            }
        }
        System.out.println("Количество четных элементов в массиве = " + k);
    }
}

