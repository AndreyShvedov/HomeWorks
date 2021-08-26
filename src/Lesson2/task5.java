package Lesson2;

public class task5 {
    public static void main(String[] args) {
        double sm;

        for (double d = 1; d <= 20; d++) {
            sm = d * 2.54;
            System.out.printf("первый элемент строки %.0f   %.2f\n", d, sm);
        }
    }
}

