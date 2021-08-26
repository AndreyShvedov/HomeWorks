package Lesson2;

public class task1 {
    public static void main(String[] args) {
        float p = 10;
        float ip = 0;
        int i = 0;

        do {
            i++;
            ip = ip + p;
            p = p * 1.1f;
        } while (i < 7);

        System.out.println("Путь, который пробежал спортсмен за 7 дней = " + ip + " км");
    }
}

