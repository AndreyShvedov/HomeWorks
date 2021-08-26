package Lesson2;

public class task3 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 1;

        while (i < 256) {
            i = i * 2;
            sum = sum + i;
        }
        System.out.println("Сумма = " + sum);
    }
}
