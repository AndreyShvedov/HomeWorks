package Lesson3;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int k = 100 / 2;
        int[] arr;
        arr = new int[k];
        int n = 1;
        for (int i = 0; i < k; i++) {
            arr[i] = n;
            n = n + 2;
        }
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = k - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

