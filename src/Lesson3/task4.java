package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr;
        arr = new int[20];

        for (int i = 0; i < 20; i++) {
            arr[i] = r.nextInt(20);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

