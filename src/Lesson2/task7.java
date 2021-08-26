package Lesson2;

public class task7 {
    public static void main(String[] args) {
        int s = 0;

        for (int i = 1; i <= 99; i += 2)
            s = s + i;
        System.out.println("Сумма нечетных чисел от 1 до 99 = " + s);
    }
}

