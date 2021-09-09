package Lesson9;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в
        позиции 0*/
        var builder = new Scanner(System.in).nextLine();
        System.out.println(procesing(builder));

    }

    public static String procesing(String text) {
        StringBuilder builder = new StringBuilder(text);
        var symbil1 = builder.charAt(3);
        var symbol2 = builder.charAt(0);
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == symbil1) {
                builder.setCharAt(i, symbol2);
            }
        }

        return builder.toString();
    }

}
