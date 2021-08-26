package Lesson2;

public class task2 {
    public static void main(String[] args) {
        int h = 0;
        int k = 1;

        while (h < 24) {
            k = k * 2;
            h = h + 3;
            System.out.println("Через " + h + " ч будет " + k + " клеток");
        }
    }
}

