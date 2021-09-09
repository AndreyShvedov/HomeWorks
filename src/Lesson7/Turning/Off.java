/*
package Lesson7.Turning;

import java.util.Scanner;

public class Off implements Turn {
    public static Integer random;
    //public String (){

    }
    public static void Off() {                //метод выключения
        System.out.println("Для выключения компьютера введите 0 или 1");
        Scanner s = new Scanner(System.in);
        random = (int) (Math.random() * 2);
        int on = s.nextInt();
        if (on == random) {
            System.out.println(random);
            System.out.println("Компьютер выключен!");
        } else {
            System.out.println(random);
            System.out.println("Компьютер сгорел!");
            System.out.println("Компьютеру конец!");
        }
    }

    public Integer getRandom() {
        return random;
    }

    public void setRandom(Integer random) {
        this.random = random;
    }
}
*/
